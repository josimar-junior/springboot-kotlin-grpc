// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package com.jj.grpc;

public final class HelloProto {
  private HelloProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jj_grpc_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jj_grpc_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jj_grpc_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jj_grpc_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HelloService.proto\022\013com.jj.grpc\"\034\n\014Hel" +
      "loRequest\022\014\n\004name\030\001 \001(\t\" \n\rHelloResponse" +
      "\022\017\n\007message\030\001 \001(\t2Q\n\014HelloService\022A\n\010say" +
      "Hello\022\031.com.jj.grpc.HelloRequest\032\032.com.j" +
      "j.grpc.HelloResponseB\016B\nHelloProtoP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_jj_grpc_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jj_grpc_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jj_grpc_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_jj_grpc_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_jj_grpc_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jj_grpc_HelloResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
