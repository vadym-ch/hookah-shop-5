package com.example.tobakkoservice.api.controllers.grpc;

import com.example.tobakkoservice.service.models.Tobakko;
import com.example.tobakkoservice.service.models.TobakkoFirm;
import com.example.tobakkoservice.service.models.TobakkoStrength;
import com.example.tobakkoservice.service.models.TobakkoTaste;
import com.example.tobakkoservice.service.TobakkoService;
import com.example.grpc.server.grpcserver.tobakko.CreateRequest;
import com.example.grpc.server.grpcserver.tobakko.CreateResponse;
import com.example.grpc.server.grpcserver.tobakko.DeleteRequest;
import com.example.grpc.server.grpcserver.tobakko.DeleteResponse;
import com.example.grpc.server.grpcserver.tobakko.GetRequest;
import com.example.grpc.server.grpcserver.tobakko.GetResponse;
import com.example.grpc.server.grpcserver.tobakko.ProtoTobakko;
import com.example.grpc.server.grpcserver.tobakko.TobakkoServiceGrpc.TobakkoServiceImplBase;
import com.example.grpc.server.grpcserver.updating.UpdateRequest;
import com.example.grpc.server.grpcserver.updating.UpdatingBalanceServiceGrpc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ImplTobakkoService extends TobakkoServiceImplBase {
    private final TobakkoService tobakkosService;

    @Autowired
    public ImplTobakkoService(TobakkoService tobakkosService) {
        this.tobakkosService = tobakkosService;
    }

    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        List<Tobakko> allTobakkos = tobakkosService.getTobakkos();

        List<ProtoTobakko> protoTobakkos = new ArrayList<>();
        for (Tobakko tobakko : allTobakkos) {
            ProtoTobakko protoTobakko = ProtoTobakko.newBuilder().setFirm(tobakko.getFirm())
                    .setTaste(tobakko.getTaste()).setStrength(tobakko.getStrength()).setPrice(tobakko.getPrice())
                    .build();
            protoTobakkos.add(protoTobakko);

        }
        GetResponse response = GetResponse.newBuilder().addAllTobakkos(protoTobakkos).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver) {
        String firm = request.getTobakko().getFirm();
        String taste = request.getTobakko().getTaste();
        String strength = request.getTobakko().getStrength();
        int price = request.getTobakko().getPrice();
        Tobakko tobakko = tobakkosService.deliverToShop(TobakkoFirm.valueOf(firm), TobakkoTaste.valueOf(taste),
                TobakkoStrength.valueOf(strength), price);

        CreateResponse response = CreateResponse.newBuilder().setId(tobakko.getTobakkoId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteRequest request, StreamObserver<DeleteResponse> responseObserver) {
        String tobakkoId = request.getTobakkoId();
        System.out.println("Hookah Id: " + tobakkoId);
        String paymentId = request.getPaymentId();
        String firm = tobakkosService.getTobakkoById(tobakkoId).getFirm();
        String taste = tobakkosService.getTobakkoById(tobakkoId).getTaste();
        String strength = tobakkosService.getTobakkoById(tobakkoId).getStrength();
        int tobakkoPrice = tobakkosService.getTobakkoPrice(tobakkoId);
        tobakkosService.sellTobakko(tobakkoId);

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9097).usePlaintext().build();
        UpdatingBalanceServiceGrpc.UpdatingBalanceServiceBlockingStub stub = UpdatingBalanceServiceGrpc
                .newBlockingStub(channel);
        stub.update(UpdateRequest.newBuilder().setPaymentId(paymentId).setAddedQuantity(tobakkoPrice).build());
        channel.shutdown();

        DeleteResponse response = DeleteResponse.newBuilder()
                .setReport(firm + " " + strength + " TOBAKKO WITH " + taste + " TASTE WAS DELETED SUCESSFULLY ")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
