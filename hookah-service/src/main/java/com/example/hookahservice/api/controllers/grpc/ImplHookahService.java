package com.example.hookahservice.api.controllers.grpc;

import com.example.hookahservice.service.models.Hookah;
import com.example.hookahservice.service.models.HookahMaterial;
import com.example.hookahservice.service.models.HookahProducer;
import com.example.hookahservice.service.models.HookahSize;
import com.example.grpc.server.grpcserver.hookah.CreateRequest;
import com.example.grpc.server.grpcserver.hookah.CreateResponse;
import com.example.grpc.server.grpcserver.hookah.DeleteRequest;
import com.example.grpc.server.grpcserver.hookah.DeleteResponse;
import com.example.grpc.server.grpcserver.hookah.GetRequest;
import com.example.grpc.server.grpcserver.hookah.GetResponse;
import com.example.grpc.server.grpcserver.hookah.ProtoHookah;
import com.example.grpc.server.grpcserver.hookah.HookahServiceGrpc.HookahServiceImplBase;
import com.example.grpc.server.grpcserver.updating.UpdateRequest;
import com.example.grpc.server.grpcserver.updating.UpdatingBalanceServiceGrpc;
import com.example.hookahservice.service.HookahService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ImplHookahService extends HookahServiceImplBase {
    private final HookahService hookahService;

    @Autowired
    public ImplHookahService(HookahService hookahService) {
        this.hookahService = hookahService;
    }

    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        List<Hookah> allHookah = hookahService.getHookahs();

        List<ProtoHookah> protoHookahs = new ArrayList<>();
        for (Hookah hookah : allHookah) {
            ProtoHookah protoHookah = ProtoHookah.newBuilder().setProducer(hookah.getProducer())
                    .setMaterial(hookah.getMaterial()).setSize(hookah.getSize()).setPrice(hookah.getPrice()).build();
            protoHookahs.add(protoHookah);

        }
        GetResponse response = GetResponse.newBuilder().addAllHookahs(protoHookahs).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver) {
        String producer = request.getHookah().getProducer();
        String material = request.getHookah().getMaterial();
        String size = request.getHookah().getSize();
        int price = request.getHookah().getPrice();
        Hookah hookah = hookahService.deliverToShop(HookahProducer.valueOf(producer), HookahMaterial.valueOf(material),
                HookahSize.valueOf(size), price);

        CreateResponse response = CreateResponse.newBuilder().setId(hookah.getId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteRequest request, StreamObserver<DeleteResponse> responseObserver) {
        String hookahId = request.getHookahId();
        System.out.println("Hookah Id: " + hookahId);
        String paymentId = request.getPaymentId();
        String producer = hookahService.getHookahById(hookahId).getProducer();
        String material = hookahService.getHookahById(hookahId).getMaterial();
        String size = hookahService.getHookahById(hookahId).getSize();

        int hookahPrice = hookahService.getHookahPrice(hookahId);
        hookahService.sellHookah(hookahId);

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9097).usePlaintext().build();
        UpdatingBalanceServiceGrpc.UpdatingBalanceServiceBlockingStub stub = UpdatingBalanceServiceGrpc
                .newBlockingStub(channel);
        stub.update(UpdateRequest.newBuilder().setPaymentId(paymentId).setAddedQuantity(hookahPrice).build());
        channel.shutdown();

        DeleteResponse response = DeleteResponse.newBuilder()
                .setReport(size + " " + material + " HOOKAH MADE IN " + producer + "WAS DELETED SUCCESSFULLY").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}