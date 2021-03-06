// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hookah.proto

package com.example.grpc.server.grpcserver.hookah;

public final class Hookah {
  private Hookah() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_hookah_ProtoHookah_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_hookah_ProtoHookah_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_hookah_DeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_hookah_DeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_hookah_DeleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_hookah_DeleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_hookah_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_hookah_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_hookah_GetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_hookah_GetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_hookah_CreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_hookah_CreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_hookah_CreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_hookah_CreateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Hookah.proto\022)com.example.grpc.server." +
      "grpcserver.hookah\"N\n\013ProtoHookah\022\020\n\010prod" +
      "ucer\030\001 \001(\t\022\020\n\010material\030\002 \001(\t\022\014\n\004size\030\003 \001" +
      "(\t\022\r\n\005price\030\004 \001(\005\"6\n\rDeleteRequest\022\021\n\tho" +
      "okah_id\030\001 \001(\t\022\022\n\npayment_id\030\002 \001(\t\" \n\016Del" +
      "eteResponse\022\016\n\006report\030\001 \001(\t\"\014\n\nGetReques" +
      "t\"V\n\013GetResponse\022G\n\007hookahs\030\001 \003(\01326.com." +
      "example.grpc.server.grpcserver.hookah.Pr" +
      "otoHookah\"W\n\rCreateRequest\022F\n\006hookah\030\001 \001" +
      "(\01326.com.example.grpc.server.grpcserver.",
      "hookah.ProtoHookah\"\034\n\016CreateResponse\022\n\n\002" +
      "id\030\001 \001(\t2\203\003\n\rHookahService\022t\n\003get\0225.com." +
      "example.grpc.server.grpcserver.hookah.Ge" +
      "tRequest\0326.com.example.grpc.server.grpcs" +
      "erver.hookah.GetResponse\022}\n\006delete\0228.com" +
      ".example.grpc.server.grpcserver.hookah.D" +
      "eleteRequest\0329.com.example.grpc.server.g" +
      "rpcserver.hookah.DeleteResponse\022}\n\006creat" +
      "e\0228.com.example.grpc.server.grpcserver.h" +
      "ookah.CreateRequest\0329.com.example.grpc.s",
      "erver.grpcserver.hookah.CreateResponseB\002" +
      "P\001b\006proto3"
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
    internal_static_com_example_grpc_server_grpcserver_hookah_ProtoHookah_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_server_grpcserver_hookah_ProtoHookah_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_hookah_ProtoHookah_descriptor,
        new java.lang.String[] { "Producer", "Material", "Size", "Price", });
    internal_static_com_example_grpc_server_grpcserver_hookah_DeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_server_grpcserver_hookah_DeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_hookah_DeleteRequest_descriptor,
        new java.lang.String[] { "HookahId", "PaymentId", });
    internal_static_com_example_grpc_server_grpcserver_hookah_DeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_server_grpcserver_hookah_DeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_hookah_DeleteResponse_descriptor,
        new java.lang.String[] { "Report", });
    internal_static_com_example_grpc_server_grpcserver_hookah_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_grpc_server_grpcserver_hookah_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_hookah_GetRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_example_grpc_server_grpcserver_hookah_GetResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_grpc_server_grpcserver_hookah_GetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_hookah_GetResponse_descriptor,
        new java.lang.String[] { "Hookahs", });
    internal_static_com_example_grpc_server_grpcserver_hookah_CreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_grpc_server_grpcserver_hookah_CreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_hookah_CreateRequest_descriptor,
        new java.lang.String[] { "Hookah", });
    internal_static_com_example_grpc_server_grpcserver_hookah_CreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_example_grpc_server_grpcserver_hookah_CreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_hookah_CreateResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
