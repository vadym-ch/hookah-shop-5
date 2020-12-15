package com.example.mediator.api.controllers.grpc;

import com.example.grpc.server.grpcserver.employee.CreateRequest;
import com.example.grpc.server.grpcserver.employee.CreateResponse;
import com.example.grpc.server.grpcserver.employee.DeleteRequest;
import com.example.grpc.server.grpcserver.employee.DeleteResponse;
import com.example.grpc.server.grpcserver.employee.EmployeeServiceGrpc;
import com.example.grpc.server.grpcserver.employee.GetRequest;
import com.example.grpc.server.grpcserver.employee.GetResponse;
import com.example.grpc.server.grpcserver.employee.EmployeeServiceGrpc.EmployeeServiceImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcEmployeeController extends EmployeeServiceImplBase {
    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092).usePlaintext().build();
        EmployeeServiceGrpc.EmployeeServiceBlockingStub stub = EmployeeServiceGrpc.newBlockingStub(channel);
        GetResponse response = stub.get(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092).usePlaintext().build();
        EmployeeServiceGrpc.EmployeeServiceBlockingStub stub = EmployeeServiceGrpc.newBlockingStub(channel);
        CreateResponse response = stub.create(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteRequest request, StreamObserver<DeleteResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092).usePlaintext().build();
        EmployeeServiceGrpc.EmployeeServiceBlockingStub stub = EmployeeServiceGrpc.newBlockingStub(channel);
        DeleteResponse response = stub.delete(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
