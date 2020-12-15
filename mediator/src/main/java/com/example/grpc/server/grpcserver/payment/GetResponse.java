// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Payment.proto

package com.example.grpc.server.grpcserver.payment;

/**
 * Protobuf type {@code com.example.grpc.server.grpcserver.payment.GetResponse}
 */
public  final class GetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.server.grpcserver.payment.GetResponse)
    GetResponseOrBuilder {
  // Use GetResponse.newBuilder() to construct.
  private GetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetResponse() {
    payments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              payments_ = new java.util.ArrayList<com.example.grpc.server.grpcserver.payment.ProtoPayment>();
              mutable_bitField0_ |= 0x00000001;
            }
            payments_.add(
                input.readMessage(com.example.grpc.server.grpcserver.payment.ProtoPayment.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        payments_ = java.util.Collections.unmodifiableList(payments_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.server.grpcserver.payment.Payment.internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.server.grpcserver.payment.Payment.internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.server.grpcserver.payment.GetResponse.class, com.example.grpc.server.grpcserver.payment.GetResponse.Builder.class);
  }

  public static final int PAYMENTS_FIELD_NUMBER = 1;
  private java.util.List<com.example.grpc.server.grpcserver.payment.ProtoPayment> payments_;
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
   */
  public java.util.List<com.example.grpc.server.grpcserver.payment.ProtoPayment> getPaymentsList() {
    return payments_;
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
   */
  public java.util.List<? extends com.example.grpc.server.grpcserver.payment.ProtoPaymentOrBuilder> 
      getPaymentsOrBuilderList() {
    return payments_;
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
   */
  public int getPaymentsCount() {
    return payments_.size();
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
   */
  public com.example.grpc.server.grpcserver.payment.ProtoPayment getPayments(int index) {
    return payments_.get(index);
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
   */
  public com.example.grpc.server.grpcserver.payment.ProtoPaymentOrBuilder getPaymentsOrBuilder(
      int index) {
    return payments_.get(index);
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
    for (int i = 0; i < payments_.size(); i++) {
      output.writeMessage(1, payments_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < payments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, payments_.get(i));
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
    if (!(obj instanceof com.example.grpc.server.grpcserver.payment.GetResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.server.grpcserver.payment.GetResponse other = (com.example.grpc.server.grpcserver.payment.GetResponse) obj;

    boolean result = true;
    result = result && getPaymentsList()
        .equals(other.getPaymentsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPaymentsCount() > 0) {
      hash = (37 * hash) + PAYMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getPaymentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.payment.GetResponse parseFrom(
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
  public static Builder newBuilder(com.example.grpc.server.grpcserver.payment.GetResponse prototype) {
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
   * Protobuf type {@code com.example.grpc.server.grpcserver.payment.GetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.server.grpcserver.payment.GetResponse)
      com.example.grpc.server.grpcserver.payment.GetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.server.grpcserver.payment.Payment.internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.server.grpcserver.payment.Payment.internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.server.grpcserver.payment.GetResponse.class, com.example.grpc.server.grpcserver.payment.GetResponse.Builder.class);
    }

    // Construct using com.example.grpc.server.grpcserver.payment.GetResponse.newBuilder()
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
        getPaymentsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (paymentsBuilder_ == null) {
        payments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        paymentsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.server.grpcserver.payment.Payment.internal_static_com_example_grpc_server_grpcserver_payment_GetResponse_descriptor;
    }

    public com.example.grpc.server.grpcserver.payment.GetResponse getDefaultInstanceForType() {
      return com.example.grpc.server.grpcserver.payment.GetResponse.getDefaultInstance();
    }

    public com.example.grpc.server.grpcserver.payment.GetResponse build() {
      com.example.grpc.server.grpcserver.payment.GetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.server.grpcserver.payment.GetResponse buildPartial() {
      com.example.grpc.server.grpcserver.payment.GetResponse result = new com.example.grpc.server.grpcserver.payment.GetResponse(this);
      int from_bitField0_ = bitField0_;
      if (paymentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          payments_ = java.util.Collections.unmodifiableList(payments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.payments_ = payments_;
      } else {
        result.payments_ = paymentsBuilder_.build();
      }
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
      if (other instanceof com.example.grpc.server.grpcserver.payment.GetResponse) {
        return mergeFrom((com.example.grpc.server.grpcserver.payment.GetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.server.grpcserver.payment.GetResponse other) {
      if (other == com.example.grpc.server.grpcserver.payment.GetResponse.getDefaultInstance()) return this;
      if (paymentsBuilder_ == null) {
        if (!other.payments_.isEmpty()) {
          if (payments_.isEmpty()) {
            payments_ = other.payments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePaymentsIsMutable();
            payments_.addAll(other.payments_);
          }
          onChanged();
        }
      } else {
        if (!other.payments_.isEmpty()) {
          if (paymentsBuilder_.isEmpty()) {
            paymentsBuilder_.dispose();
            paymentsBuilder_ = null;
            payments_ = other.payments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            paymentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPaymentsFieldBuilder() : null;
          } else {
            paymentsBuilder_.addAllMessages(other.payments_);
          }
        }
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
      com.example.grpc.server.grpcserver.payment.GetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.server.grpcserver.payment.GetResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.grpc.server.grpcserver.payment.ProtoPayment> payments_ =
      java.util.Collections.emptyList();
    private void ensurePaymentsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        payments_ = new java.util.ArrayList<com.example.grpc.server.grpcserver.payment.ProtoPayment>(payments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.server.grpcserver.payment.ProtoPayment, com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder, com.example.grpc.server.grpcserver.payment.ProtoPaymentOrBuilder> paymentsBuilder_;

    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public java.util.List<com.example.grpc.server.grpcserver.payment.ProtoPayment> getPaymentsList() {
      if (paymentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(payments_);
      } else {
        return paymentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public int getPaymentsCount() {
      if (paymentsBuilder_ == null) {
        return payments_.size();
      } else {
        return paymentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public com.example.grpc.server.grpcserver.payment.ProtoPayment getPayments(int index) {
      if (paymentsBuilder_ == null) {
        return payments_.get(index);
      } else {
        return paymentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public Builder setPayments(
        int index, com.example.grpc.server.grpcserver.payment.ProtoPayment value) {
      if (paymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaymentsIsMutable();
        payments_.set(index, value);
        onChanged();
      } else {
        paymentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public Builder setPayments(
        int index, com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder builderForValue) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        payments_.set(index, builderForValue.build());
        onChanged();
      } else {
        paymentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public Builder addPayments(com.example.grpc.server.grpcserver.payment.ProtoPayment value) {
      if (paymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaymentsIsMutable();
        payments_.add(value);
        onChanged();
      } else {
        paymentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public Builder addPayments(
        int index, com.example.grpc.server.grpcserver.payment.ProtoPayment value) {
      if (paymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaymentsIsMutable();
        payments_.add(index, value);
        onChanged();
      } else {
        paymentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public Builder addPayments(
        com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder builderForValue) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        payments_.add(builderForValue.build());
        onChanged();
      } else {
        paymentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public Builder addPayments(
        int index, com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder builderForValue) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        payments_.add(index, builderForValue.build());
        onChanged();
      } else {
        paymentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public Builder addAllPayments(
        java.lang.Iterable<? extends com.example.grpc.server.grpcserver.payment.ProtoPayment> values) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, payments_);
        onChanged();
      } else {
        paymentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public Builder clearPayments() {
      if (paymentsBuilder_ == null) {
        payments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        paymentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public Builder removePayments(int index) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        payments_.remove(index);
        onChanged();
      } else {
        paymentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder getPaymentsBuilder(
        int index) {
      return getPaymentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public com.example.grpc.server.grpcserver.payment.ProtoPaymentOrBuilder getPaymentsOrBuilder(
        int index) {
      if (paymentsBuilder_ == null) {
        return payments_.get(index);  } else {
        return paymentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public java.util.List<? extends com.example.grpc.server.grpcserver.payment.ProtoPaymentOrBuilder> 
         getPaymentsOrBuilderList() {
      if (paymentsBuilder_ != null) {
        return paymentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(payments_);
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder addPaymentsBuilder() {
      return getPaymentsFieldBuilder().addBuilder(
          com.example.grpc.server.grpcserver.payment.ProtoPayment.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder addPaymentsBuilder(
        int index) {
      return getPaymentsFieldBuilder().addBuilder(
          index, com.example.grpc.server.grpcserver.payment.ProtoPayment.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.payment.ProtoPayment payments = 1;</code>
     */
    public java.util.List<com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder> 
         getPaymentsBuilderList() {
      return getPaymentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.server.grpcserver.payment.ProtoPayment, com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder, com.example.grpc.server.grpcserver.payment.ProtoPaymentOrBuilder> 
        getPaymentsFieldBuilder() {
      if (paymentsBuilder_ == null) {
        paymentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.grpc.server.grpcserver.payment.ProtoPayment, com.example.grpc.server.grpcserver.payment.ProtoPayment.Builder, com.example.grpc.server.grpcserver.payment.ProtoPaymentOrBuilder>(
                payments_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        payments_ = null;
      }
      return paymentsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.server.grpcserver.payment.GetResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.server.grpcserver.payment.GetResponse)
  private static final com.example.grpc.server.grpcserver.payment.GetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.server.grpcserver.payment.GetResponse();
  }

  public static com.example.grpc.server.grpcserver.payment.GetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetResponse>() {
    public GetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetResponse> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.server.grpcserver.payment.GetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
