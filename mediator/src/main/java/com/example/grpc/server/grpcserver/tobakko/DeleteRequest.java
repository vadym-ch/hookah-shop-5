// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tobakko.proto

package com.example.grpc.server.grpcserver.tobakko;

/**
 * Protobuf type {@code com.example.grpc.server.grpcserver.tobakko.DeleteRequest}
 */
public  final class DeleteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.server.grpcserver.tobakko.DeleteRequest)
    DeleteRequestOrBuilder {
  // Use DeleteRequest.newBuilder() to construct.
  private DeleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteRequest() {
    tobakkoId_ = "";
    paymentId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DeleteRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            tobakkoId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            paymentId_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.server.grpcserver.tobakko.Tobakko.internal_static_com_example_grpc_server_grpcserver_tobakko_DeleteRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.server.grpcserver.tobakko.Tobakko.internal_static_com_example_grpc_server_grpcserver_tobakko_DeleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.server.grpcserver.tobakko.DeleteRequest.class, com.example.grpc.server.grpcserver.tobakko.DeleteRequest.Builder.class);
  }

  public static final int TOBAKKO_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object tobakkoId_;
  /**
   * <code>string tobakko_id = 1;</code>
   */
  public java.lang.String getTobakkoId() {
    java.lang.Object ref = tobakkoId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tobakkoId_ = s;
      return s;
    }
  }
  /**
   * <code>string tobakko_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTobakkoIdBytes() {
    java.lang.Object ref = tobakkoId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tobakkoId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYMENT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object paymentId_;
  /**
   * <code>string payment_id = 2;</code>
   */
  public java.lang.String getPaymentId() {
    java.lang.Object ref = paymentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paymentId_ = s;
      return s;
    }
  }
  /**
   * <code>string payment_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPaymentIdBytes() {
    java.lang.Object ref = paymentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paymentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTobakkoIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tobakkoId_);
    }
    if (!getPaymentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, paymentId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTobakkoIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tobakkoId_);
    }
    if (!getPaymentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, paymentId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.server.grpcserver.tobakko.DeleteRequest)) {
      return super.equals(obj);
    }
    com.example.grpc.server.grpcserver.tobakko.DeleteRequest other = (com.example.grpc.server.grpcserver.tobakko.DeleteRequest) obj;

    boolean result = true;
    result = result && getTobakkoId()
        .equals(other.getTobakkoId());
    result = result && getPaymentId()
        .equals(other.getPaymentId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOBAKKO_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTobakkoId().hashCode();
    hash = (37 * hash) + PAYMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.server.grpcserver.tobakko.DeleteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.grpc.server.grpcserver.tobakko.DeleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.server.grpcserver.tobakko.DeleteRequest)
      com.example.grpc.server.grpcserver.tobakko.DeleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.server.grpcserver.tobakko.Tobakko.internal_static_com_example_grpc_server_grpcserver_tobakko_DeleteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.server.grpcserver.tobakko.Tobakko.internal_static_com_example_grpc_server_grpcserver_tobakko_DeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.server.grpcserver.tobakko.DeleteRequest.class, com.example.grpc.server.grpcserver.tobakko.DeleteRequest.Builder.class);
    }

    // Construct using com.example.grpc.server.grpcserver.tobakko.DeleteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      tobakkoId_ = "";

      paymentId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.server.grpcserver.tobakko.Tobakko.internal_static_com_example_grpc_server_grpcserver_tobakko_DeleteRequest_descriptor;
    }

    public com.example.grpc.server.grpcserver.tobakko.DeleteRequest getDefaultInstanceForType() {
      return com.example.grpc.server.grpcserver.tobakko.DeleteRequest.getDefaultInstance();
    }

    public com.example.grpc.server.grpcserver.tobakko.DeleteRequest build() {
      com.example.grpc.server.grpcserver.tobakko.DeleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.server.grpcserver.tobakko.DeleteRequest buildPartial() {
      com.example.grpc.server.grpcserver.tobakko.DeleteRequest result = new com.example.grpc.server.grpcserver.tobakko.DeleteRequest(this);
      result.tobakkoId_ = tobakkoId_;
      result.paymentId_ = paymentId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.server.grpcserver.tobakko.DeleteRequest) {
        return mergeFrom((com.example.grpc.server.grpcserver.tobakko.DeleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.server.grpcserver.tobakko.DeleteRequest other) {
      if (other == com.example.grpc.server.grpcserver.tobakko.DeleteRequest.getDefaultInstance()) return this;
      if (!other.getTobakkoId().isEmpty()) {
        tobakkoId_ = other.tobakkoId_;
        onChanged();
      }
      if (!other.getPaymentId().isEmpty()) {
        paymentId_ = other.paymentId_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.grpc.server.grpcserver.tobakko.DeleteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.server.grpcserver.tobakko.DeleteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tobakkoId_ = "";
    /**
     * <code>string tobakko_id = 1;</code>
     */
    public java.lang.String getTobakkoId() {
      java.lang.Object ref = tobakkoId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tobakkoId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tobakko_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTobakkoIdBytes() {
      java.lang.Object ref = tobakkoId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tobakkoId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tobakko_id = 1;</code>
     */
    public Builder setTobakkoId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tobakkoId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tobakko_id = 1;</code>
     */
    public Builder clearTobakkoId() {
      
      tobakkoId_ = getDefaultInstance().getTobakkoId();
      onChanged();
      return this;
    }
    /**
     * <code>string tobakko_id = 1;</code>
     */
    public Builder setTobakkoIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tobakkoId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object paymentId_ = "";
    /**
     * <code>string payment_id = 2;</code>
     */
    public java.lang.String getPaymentId() {
      java.lang.Object ref = paymentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string payment_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPaymentIdBytes() {
      java.lang.Object ref = paymentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string payment_id = 2;</code>
     */
    public Builder setPaymentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      paymentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string payment_id = 2;</code>
     */
    public Builder clearPaymentId() {
      
      paymentId_ = getDefaultInstance().getPaymentId();
      onChanged();
      return this;
    }
    /**
     * <code>string payment_id = 2;</code>
     */
    public Builder setPaymentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      paymentId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.server.grpcserver.tobakko.DeleteRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.server.grpcserver.tobakko.DeleteRequest)
  private static final com.example.grpc.server.grpcserver.tobakko.DeleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.server.grpcserver.tobakko.DeleteRequest();
  }

  public static com.example.grpc.server.grpcserver.tobakko.DeleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRequest>() {
    public DeleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeleteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRequest> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.server.grpcserver.tobakko.DeleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

