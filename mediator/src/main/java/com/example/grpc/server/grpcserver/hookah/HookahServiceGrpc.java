package com.example.grpc.server.grpcserver.hookah;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: Hookah.proto")
public final class HookahServiceGrpc {

  private HookahServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.server.grpcserver.hookah.HookahService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.server.grpcserver.hookah.GetRequest,
      com.example.grpc.server.grpcserver.hookah.GetResponse> METHOD_GET =
      io.grpc.MethodDescriptor.<com.example.grpc.server.grpcserver.hookah.GetRequest, com.example.grpc.server.grpcserver.hookah.GetResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.server.grpcserver.hookah.HookahService", "get"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.grpcserver.hookah.GetRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.grpcserver.hookah.GetResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.server.grpcserver.hookah.DeleteRequest,
      com.example.grpc.server.grpcserver.hookah.DeleteResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.<com.example.grpc.server.grpcserver.hookah.DeleteRequest, com.example.grpc.server.grpcserver.hookah.DeleteResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.server.grpcserver.hookah.HookahService", "delete"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.grpcserver.hookah.DeleteRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.grpcserver.hookah.DeleteResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.server.grpcserver.hookah.CreateRequest,
      com.example.grpc.server.grpcserver.hookah.CreateResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.<com.example.grpc.server.grpcserver.hookah.CreateRequest, com.example.grpc.server.grpcserver.hookah.CreateResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.server.grpcserver.hookah.HookahService", "create"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.grpcserver.hookah.CreateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.grpcserver.hookah.CreateResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HookahServiceStub newStub(io.grpc.Channel channel) {
    return new HookahServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HookahServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HookahServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HookahServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HookahServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HookahServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(com.example.grpc.server.grpcserver.hookah.GetRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.hookah.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET, responseObserver);
    }

    /**
     */
    public void delete(com.example.grpc.server.grpcserver.hookah.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.hookah.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void create(com.example.grpc.server.grpcserver.hookah.CreateRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.hookah.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.server.grpcserver.hookah.GetRequest,
                com.example.grpc.server.grpcserver.hookah.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.server.grpcserver.hookah.DeleteRequest,
                com.example.grpc.server.grpcserver.hookah.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.server.grpcserver.hookah.CreateRequest,
                com.example.grpc.server.grpcserver.hookah.CreateResponse>(
                  this, METHODID_CREATE)))
          .build();
    }
  }

  /**
   */
  public static final class HookahServiceStub extends io.grpc.stub.AbstractStub<HookahServiceStub> {
    private HookahServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HookahServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HookahServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HookahServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(com.example.grpc.server.grpcserver.hookah.GetRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.hookah.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.example.grpc.server.grpcserver.hookah.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.hookah.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.example.grpc.server.grpcserver.hookah.CreateRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.hookah.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HookahServiceBlockingStub extends io.grpc.stub.AbstractStub<HookahServiceBlockingStub> {
    private HookahServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HookahServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HookahServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HookahServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.server.grpcserver.hookah.GetResponse get(com.example.grpc.server.grpcserver.hookah.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET, getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.server.grpcserver.hookah.DeleteResponse delete(com.example.grpc.server.grpcserver.hookah.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.server.grpcserver.hookah.CreateResponse create(com.example.grpc.server.grpcserver.hookah.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HookahServiceFutureStub extends io.grpc.stub.AbstractStub<HookahServiceFutureStub> {
    private HookahServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HookahServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HookahServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HookahServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.server.grpcserver.hookah.GetResponse> get(
        com.example.grpc.server.grpcserver.hookah.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.server.grpcserver.hookah.DeleteResponse> delete(
        com.example.grpc.server.grpcserver.hookah.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.server.grpcserver.hookah.CreateResponse> create(
        com.example.grpc.server.grpcserver.hookah.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_CREATE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HookahServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HookahServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.example.grpc.server.grpcserver.hookah.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.hookah.GetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.example.grpc.server.grpcserver.hookah.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.hookah.DeleteResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.example.grpc.server.grpcserver.hookah.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.hookah.CreateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class HookahServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.server.grpcserver.hookah.Hookah.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HookahServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HookahServiceDescriptorSupplier())
              .addMethod(METHOD_GET)
              .addMethod(METHOD_DELETE)
              .addMethod(METHOD_CREATE)
              .build();
        }
      }
    }
    return result;
  }
}
