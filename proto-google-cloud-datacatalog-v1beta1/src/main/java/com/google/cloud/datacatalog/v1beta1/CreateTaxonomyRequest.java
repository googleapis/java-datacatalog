/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/policytagmanager.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [CreateTaxonomy][google.cloud.datacatalog.v1beta1.PolicyTagManager.CreateTaxonomy].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest}
 */
public final class CreateTaxonomyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest)
    CreateTaxonomyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateTaxonomyRequest.newBuilder() to construct.
  private CreateTaxonomyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateTaxonomyRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateTaxonomyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateTaxonomyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder subBuilder = null;
              if (taxonomy_ != null) {
                subBuilder = taxonomy_.toBuilder();
              }
              taxonomy_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.v1beta1.Taxonomy.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(taxonomy_);
                taxonomy_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest.class,
            com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Resource name of the project that the taxonomy will belong to.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Resource name of the project that the taxonomy will belong to.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAXONOMY_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy_;
  /**
   *
   *
   * <pre>
   * The taxonomy to be created.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
   *
   * @return Whether the taxonomy field is set.
   */
  public boolean hasTaxonomy() {
    return taxonomy_ != null;
  }
  /**
   *
   *
   * <pre>
   * The taxonomy to be created.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
   *
   * @return The taxonomy.
   */
  public com.google.cloud.datacatalog.v1beta1.Taxonomy getTaxonomy() {
    return taxonomy_ == null
        ? com.google.cloud.datacatalog.v1beta1.Taxonomy.getDefaultInstance()
        : taxonomy_;
  }
  /**
   *
   *
   * <pre>
   * The taxonomy to be created.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
   */
  public com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder getTaxonomyOrBuilder() {
    return getTaxonomy();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (taxonomy_ != null) {
      output.writeMessage(2, getTaxonomy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (taxonomy_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTaxonomy());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest other =
        (com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasTaxonomy() != other.hasTaxonomy()) return false;
    if (hasTaxonomy()) {
      if (!getTaxonomy().equals(other.getTaxonomy())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasTaxonomy()) {
      hash = (37 * hash) + TAXONOMY_FIELD_NUMBER;
      hash = (53 * hash) + getTaxonomy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for
   * [CreateTaxonomy][google.cloud.datacatalog.v1beta1.PolicyTagManager.CreateTaxonomy].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest)
      com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest.class,
              com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (taxonomyBuilder_ == null) {
        taxonomy_ = null;
      } else {
        taxonomy_ = null;
        taxonomyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest build() {
      com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest buildPartial() {
      com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest result =
          new com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest(this);
      result.parent_ = parent_;
      if (taxonomyBuilder_ == null) {
        result.taxonomy_ = taxonomy_;
      } else {
        result.taxonomy_ = taxonomyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest other) {
      if (other == com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasTaxonomy()) {
        mergeTaxonomy(other.getTaxonomy());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the project that the taxonomy will belong to.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the project that the taxonomy will belong to.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the project that the taxonomy will belong to.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the project that the taxonomy will belong to.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the project that the taxonomy will belong to.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.Taxonomy,
            com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder,
            com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder>
        taxonomyBuilder_;
    /**
     *
     *
     * <pre>
     * The taxonomy to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
     *
     * @return Whether the taxonomy field is set.
     */
    public boolean hasTaxonomy() {
      return taxonomyBuilder_ != null || taxonomy_ != null;
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
     *
     * @return The taxonomy.
     */
    public com.google.cloud.datacatalog.v1beta1.Taxonomy getTaxonomy() {
      if (taxonomyBuilder_ == null) {
        return taxonomy_ == null
            ? com.google.cloud.datacatalog.v1beta1.Taxonomy.getDefaultInstance()
            : taxonomy_;
      } else {
        return taxonomyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
     */
    public Builder setTaxonomy(com.google.cloud.datacatalog.v1beta1.Taxonomy value) {
      if (taxonomyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        taxonomy_ = value;
        onChanged();
      } else {
        taxonomyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
     */
    public Builder setTaxonomy(
        com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder builderForValue) {
      if (taxonomyBuilder_ == null) {
        taxonomy_ = builderForValue.build();
        onChanged();
      } else {
        taxonomyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
     */
    public Builder mergeTaxonomy(com.google.cloud.datacatalog.v1beta1.Taxonomy value) {
      if (taxonomyBuilder_ == null) {
        if (taxonomy_ != null) {
          taxonomy_ =
              com.google.cloud.datacatalog.v1beta1.Taxonomy.newBuilder(taxonomy_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          taxonomy_ = value;
        }
        onChanged();
      } else {
        taxonomyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
     */
    public Builder clearTaxonomy() {
      if (taxonomyBuilder_ == null) {
        taxonomy_ = null;
        onChanged();
      } else {
        taxonomy_ = null;
        taxonomyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder getTaxonomyBuilder() {

      onChanged();
      return getTaxonomyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder getTaxonomyOrBuilder() {
      if (taxonomyBuilder_ != null) {
        return taxonomyBuilder_.getMessageOrBuilder();
      } else {
        return taxonomy_ == null
            ? com.google.cloud.datacatalog.v1beta1.Taxonomy.getDefaultInstance()
            : taxonomy_;
      }
    }
    /**
     *
     *
     * <pre>
     * The taxonomy to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Taxonomy taxonomy = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.Taxonomy,
            com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder,
            com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder>
        getTaxonomyFieldBuilder() {
      if (taxonomyBuilder_ == null) {
        taxonomyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1beta1.Taxonomy,
                com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder,
                com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder>(
                getTaxonomy(), getParentForChildren(), isClean());
        taxonomy_ = null;
      }
      return taxonomyBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest)
  private static final com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest();
  }

  public static com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTaxonomyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateTaxonomyRequest>() {
        @java.lang.Override
        public CreateTaxonomyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateTaxonomyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateTaxonomyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTaxonomyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.CreateTaxonomyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
