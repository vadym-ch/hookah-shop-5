package com.example.mediator.api.controllers.grpc;

import com.example.grpc.server.grpcserver.tobakko.CreateRequest;
import com.example.grpc.server.grpcserver.tobakko.CreateResponse;
import com.example.grpc.server.grpcserver.tobakko.DeleteRequest;
import com.example.grpc.server.grpcserver.tobakko.DeleteResponse;
import com.example.grpc.server.grpcserver.tobakko.GetRequest;
import com.example.grpc.server.grpcserver.tobakko.GetResponse;
import com.example.grpc.server.grpcserver.tobakko.TobakkoServiceGrpc;
import com.example.grpc.server.grpcserver.tobakko.TobakkoServiceGrpc.TobakkoServiceImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcTobakkoController extends TobakkoServiceImplBase {
    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9098).usePlaintext().build();
        TobakkoServiceGrpc.TobakkoServiceBlockingStub stub = TobakkoServiceGrpc.newBlockingStub(channel);
        GetResponse response = stub.get(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9098).usePlaintext().build();
        TobakkoServiceGrpc.TobakkoServiceBlockingStub stub = TobakkoServiceGrpc.newBlockingStub(channel);
        CreateResponse response = stub.create(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteRequest request, StreamObserver<DeleteResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9098).usePlaintext().build();
        TobakkoServiceGrpc.TobakkoServiceBlockingStub stub = TobakkoServiceGrpc.newBlockingStub(channel);
        DeleteResponse response = stub.delete(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
