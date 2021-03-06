// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Employee.proto

package com.example.grpc.server.grpcserver.employee;

public final class Employee {
  private Employee() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_employee_ProtoEmployee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_employee_ProtoEmployee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_employee_DeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_employee_DeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_employee_DeleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_employee_DeleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_employee_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_employee_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_employee_GetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_employee_GetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_employee_CreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_employee_CreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_employee_CreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_employee_CreateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Employee.proto\022+com.example.grpc.serve" +
      "r.grpcserver.employee\".\n\rProtoEmployee\022\014" +
      "\n\004name\030\001 \001(\t\022\017\n\007surname\030\002 \001(\t\"\033\n\rDeleteR" +
      "equest\022\n\n\002id\030\001 \001(\t\" \n\016DeleteResponse\022\016\n\006" +
      "report\030\001 \001(\t\"\014\n\nGetRequest\"\\\n\013GetRespons" +
      "e\022M\n\temployees\030\001 \003(\0132:.com.example.grpc." +
      "server.grpcserver.employee.ProtoEmployee" +
      "\"]\n\rCreateRequest\022L\n\010employee\030\001 \001(\0132:.co" +
      "m.example.grpc.server.grpcserver.employe" +
      "e.ProtoEmployee\"\034\n\016CreateResponse\022\n\n\002id\030",
      "\001 \001(\t2\223\003\n\017EmployeeService\022x\n\003get\0227.com.e" +
      "xample.grpc.server.grpcserver.employee.G" +
      "etRequest\0328.com.example.grpc.server.grpc" +
      "server.employee.GetResponse\022\201\001\n\006delete\022:" +
      ".com.example.grpc.server.grpcserver.empl" +
      "oyee.DeleteRequest\032;.com.example.grpc.se" +
      "rver.grpcserver.employee.DeleteResponse\022" +
      "\201\001\n\006create\022:.com.example.grpc.server.grp" +
      "cserver.employee.CreateRequest\032;.com.exa" +
      "mple.grpc.server.grpcserver.employee.Cre",
      "ateResponseB\002P\001b\006proto3"
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
    internal_static_com_example_grpc_server_grpcserver_employee_ProtoEmployee_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_server_grpcserver_employee_ProtoEmployee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_employee_ProtoEmployee_descriptor,
        new java.lang.String[] { "Name", "Surname", });
    internal_static_com_example_grpc_server_grpcserver_employee_DeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_server_grpcserver_employee_DeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_employee_DeleteRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_example_grpc_server_grpcserver_employee_DeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_server_grpcserver_employee_DeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_employee_DeleteResponse_descriptor,
        new java.lang.String[] { "Report", });
    internal_static_com_example_grpc_server_grpcserver_employee_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_grpc_server_grpcserver_employee_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_employee_GetRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_example_grpc_server_grpcserver_employee_GetResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_grpc_server_grpcserver_employee_GetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_employee_GetResponse_descriptor,
        new java.lang.String[] { "Employees", });
    internal_static_com_example_grpc_server_grpcserver_employee_CreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_grpc_server_grpcserver_employee_CreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_employee_CreateRequest_descriptor,
        new java.lang.String[] { "Employee", });
    internal_static_com_example_grpc_server_grpcserver_employee_CreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_example_grpc_server_grpcserver_employee_CreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_employee_CreateResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
