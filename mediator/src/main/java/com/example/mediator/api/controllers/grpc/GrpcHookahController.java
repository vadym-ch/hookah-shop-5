package com.example.mediator.api.controllers.grpc;

import com.example.grpc.server.grpcserver.hookah.CreateRequest;
import com.example.grpc.server.grpcserver.hookah.CreateResponse;
import com.example.grpc.server.grpcserver.hookah.DeleteRequest;
import com.example.grpc.server.grpcserver.hookah.DeleteResponse;
import com.example.grpc.server.grpcserver.hookah.GetRequest;
import com.example.grpc.server.grpcserver.hookah.GetResponse;
import com.example.grpc.server.grpcserver.hookah.HookahServiceGrpc;
import com.example.grpc.server.grpcserver.hookah.HookahServiceGrpc.HookahServiceImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class GrpcHookahController extends HookahServiceImplBase {
    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        HookahServiceGrpc.HookahServiceBlockingStub stub = HookahServiceGrpc.newBlockingStub(channel);
        GetResponse response = stub.get(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        HookahServiceGrpc.HookahServiceBlockingStub stub = HookahServiceGrpc.newBlockingStub(channel);
        CreateResponse response = stub.create(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteRequest request, StreamObserver<DeleteResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        HookahServiceGrpc.HookahServiceBlockingStub stub = HookahServiceGrpc.newBlockingStub(channel);
        DeleteResponse response = stub.delete(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
