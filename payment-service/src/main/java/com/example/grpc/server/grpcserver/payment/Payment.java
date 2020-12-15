// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Payment.proto

package com.example.grpc.server.grpcserver.payment;

public final class Payment {
  private Payment() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_payment_ProtoPayment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_payment_ProtoPayment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_payment_DeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_payment_DeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_payment_DeleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_payment_DeleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_payment_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_payment_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_payment_CreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_payment_CreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_payment_CreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_payment_CreateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rPayment.proto\022*com.example.grpc.server" +
      ".grpcserver.payment\"4\n\014ProtoPayment\022\014\n\004d" +
      "esk\030\001 \001(\005\022\026\n\016added_quantity\030\002 \001(\005\"#\n\rDel" +
      "eteRequest\022\022\n\npayment_id\030\001 \001(\t\" \n\016Delete" +
      "Response\022\016\n\006report\030\001 \001(\t\"\014\n\nGetRequest\"Y" +
      "\n\013GetResponse\022J\n\010payments\030\001 \003(\01328.com.ex" +
      "ample.grpc.server.grpcserver.payment.Pro" +
      "toPayment\"Z\n\rCreateRequest\022I\n\007payment\030\001 " +
      "\001(\01328.com.example.grpc.server.grpcserver" +
      ".payment.ProtoPayment\"\034\n\016CreateResponse\022",
      "\n\n\002id\030\001 \001(\t2\212\003\n\016PaymentService\022v\n\003get\0226." +
      "com.example.grpc.server.grpcserver.payme" +
      "nt.GetRequest\0327.com.example.grpc.server." +
      "grpcserver.payment.GetResponse\022\177\n\006delete" +
      "\0229.com.example.grpc.server.grpcserver.pa" +
      "yment.DeleteRequest\032:.com.example.grpc.s" +
      "erver.grpcserver.payment.DeleteResponse\022" +
      "\177\n\006create\0229.com.example.grpc.server.grpc" +
      "server.payment.CreateRequest\032:.com.examp" +
      "le.grpc.server.grpcserver.payment.Create",
      "ResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_server_grpcserver_payment_ProtoPayment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_server_grpcserver_payment_ProtoPayment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_payment_ProtoPayment_descriptor,
        new java.lang.String[] { "Desk", "AddedQuantity", });
    internal_static_com_example_grpc_server_grpcserver_payment_DeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_server_grpcserver_payment_DeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_payment_DeleteRequest_descriptor,
        new java.lang.String[] { "PaymentId", });
    internal_static_com_example_grpc_server_grpcserver_payment_DeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_server_grpcserver_payment_DeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_payment_DeleteResponse_descriptor,
        new java.lang.String[] { "Report", });
    internal_static_com_example_grpc_server_grpcserver_payment_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_grpc_server_grpcserver_payment_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_payment_GetRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_descriptor,
        new java.lang.String[] { "Payments", });
    internal_static_com_example_grpc_server_grpcserver_payment_CreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_grpc_server_grpcserver_payment_CreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_payment_CreateRequest_descriptor,
        new java.lang.String[] { "Payment", });
    internal_static_com_example_grpc_server_grpcserver_payment_CreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_example_grpc_server_grpcserver_payment_CreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_payment_CreateResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}