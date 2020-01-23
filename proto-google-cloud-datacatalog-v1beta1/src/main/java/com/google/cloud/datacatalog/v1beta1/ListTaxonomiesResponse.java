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
 * Response message for
 * [ListTaxonomies][google.cloud.datacatalog.v1beta1.PolicyTagManager.ListTaxonomies].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse}
 */
public final class ListTaxonomiesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse)
    ListTaxonomiesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTaxonomiesResponse.newBuilder() to construct.
  private ListTaxonomiesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTaxonomiesResponse() {
    taxonomies_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListTaxonomiesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListTaxonomiesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                taxonomies_ =
                    new java.util.ArrayList<com.google.cloud.datacatalog.v1beta1.Taxonomy>();
                mutable_bitField0_ |= 0x00000001;
              }
              taxonomies_.add(
                  input.readMessage(
                      com.google.cloud.datacatalog.v1beta1.Taxonomy.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        taxonomies_ = java.util.Collections.unmodifiableList(taxonomies_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse.class,
            com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse.Builder.class);
  }

  public static final int TAXONOMIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datacatalog.v1beta1.Taxonomy> taxonomies_;
  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
   */
  public java.util.List<com.google.cloud.datacatalog.v1beta1.Taxonomy> getTaxonomiesList() {
    return taxonomies_;
  }
  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder>
      getTaxonomiesOrBuilderList() {
    return taxonomies_;
  }
  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
   */
  public int getTaxonomiesCount() {
    return taxonomies_.size();
  }
  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
   */
  public com.google.cloud.datacatalog.v1beta1.Taxonomy getTaxonomies(int index) {
    return taxonomies_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Taxonomies that the project contains.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
   */
  public com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder getTaxonomiesOrBuilder(int index) {
    return taxonomies_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token used to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token used to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < taxonomies_.size(); i++) {
      output.writeMessage(1, taxonomies_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < taxonomies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, taxonomies_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse other =
        (com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse) obj;

    if (!getTaxonomiesList().equals(other.getTaxonomiesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getTaxonomiesCount() > 0) {
      hash = (37 * hash) + TAXONOMIES_FIELD_NUMBER;
      hash = (53 * hash) + getTaxonomiesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parseFrom(
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
      com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse prototype) {
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
   * Response message for
   * [ListTaxonomies][google.cloud.datacatalog.v1beta1.PolicyTagManager.ListTaxonomies].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse)
      com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse.class,
              com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTaxonomiesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (taxonomiesBuilder_ == null) {
        taxonomies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        taxonomiesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse build() {
      com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse buildPartial() {
      com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse result =
          new com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse(this);
      int from_bitField0_ = bitField0_;
      if (taxonomiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          taxonomies_ = java.util.Collections.unmodifiableList(taxonomies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.taxonomies_ = taxonomies_;
      } else {
        result.taxonomies_ = taxonomiesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse other) {
      if (other == com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse.getDefaultInstance())
        return this;
      if (taxonomiesBuilder_ == null) {
        if (!other.taxonomies_.isEmpty()) {
          if (taxonomies_.isEmpty()) {
            taxonomies_ = other.taxonomies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTaxonomiesIsMutable();
            taxonomies_.addAll(other.taxonomies_);
          }
          onChanged();
        }
      } else {
        if (!other.taxonomies_.isEmpty()) {
          if (taxonomiesBuilder_.isEmpty()) {
            taxonomiesBuilder_.dispose();
            taxonomiesBuilder_ = null;
            taxonomies_ = other.taxonomies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            taxonomiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTaxonomiesFieldBuilder()
                    : null;
          } else {
            taxonomiesBuilder_.addAllMessages(other.taxonomies_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.datacatalog.v1beta1.Taxonomy> taxonomies_ =
        java.util.Collections.emptyList();

    private void ensureTaxonomiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        taxonomies_ =
            new java.util.ArrayList<com.google.cloud.datacatalog.v1beta1.Taxonomy>(taxonomies_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.Taxonomy,
            com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder,
            com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder>
        taxonomiesBuilder_;

    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1beta1.Taxonomy> getTaxonomiesList() {
      if (taxonomiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(taxonomies_);
      } else {
        return taxonomiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public int getTaxonomiesCount() {
      if (taxonomiesBuilder_ == null) {
        return taxonomies_.size();
      } else {
        return taxonomiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.Taxonomy getTaxonomies(int index) {
      if (taxonomiesBuilder_ == null) {
        return taxonomies_.get(index);
      } else {
        return taxonomiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public Builder setTaxonomies(int index, com.google.cloud.datacatalog.v1beta1.Taxonomy value) {
      if (taxonomiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaxonomiesIsMutable();
        taxonomies_.set(index, value);
        onChanged();
      } else {
        taxonomiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public Builder setTaxonomies(
        int index, com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder builderForValue) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        taxonomies_.set(index, builderForValue.build());
        onChanged();
      } else {
        taxonomiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public Builder addTaxonomies(com.google.cloud.datacatalog.v1beta1.Taxonomy value) {
      if (taxonomiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaxonomiesIsMutable();
        taxonomies_.add(value);
        onChanged();
      } else {
        taxonomiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public Builder addTaxonomies(int index, com.google.cloud.datacatalog.v1beta1.Taxonomy value) {
      if (taxonomiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaxonomiesIsMutable();
        taxonomies_.add(index, value);
        onChanged();
      } else {
        taxonomiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public Builder addTaxonomies(
        com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder builderForValue) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        taxonomies_.add(builderForValue.build());
        onChanged();
      } else {
        taxonomiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public Builder addTaxonomies(
        int index, com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder builderForValue) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        taxonomies_.add(index, builderForValue.build());
        onChanged();
      } else {
        taxonomiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public Builder addAllTaxonomies(
        java.lang.Iterable<? extends com.google.cloud.datacatalog.v1beta1.Taxonomy> values) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, taxonomies_);
        onChanged();
      } else {
        taxonomiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public Builder clearTaxonomies() {
      if (taxonomiesBuilder_ == null) {
        taxonomies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        taxonomiesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public Builder removeTaxonomies(int index) {
      if (taxonomiesBuilder_ == null) {
        ensureTaxonomiesIsMutable();
        taxonomies_.remove(index);
        onChanged();
      } else {
        taxonomiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder getTaxonomiesBuilder(int index) {
      return getTaxonomiesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder getTaxonomiesOrBuilder(
        int index) {
      if (taxonomiesBuilder_ == null) {
        return taxonomies_.get(index);
      } else {
        return taxonomiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder>
        getTaxonomiesOrBuilderList() {
      if (taxonomiesBuilder_ != null) {
        return taxonomiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(taxonomies_);
      }
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder addTaxonomiesBuilder() {
      return getTaxonomiesFieldBuilder()
          .addBuilder(com.google.cloud.datacatalog.v1beta1.Taxonomy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder addTaxonomiesBuilder(int index) {
      return getTaxonomiesFieldBuilder()
          .addBuilder(index, com.google.cloud.datacatalog.v1beta1.Taxonomy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Taxonomies that the project contains.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.Taxonomy taxonomies = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder>
        getTaxonomiesBuilderList() {
      return getTaxonomiesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.Taxonomy,
            com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder,
            com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder>
        getTaxonomiesFieldBuilder() {
      if (taxonomiesBuilder_ == null) {
        taxonomiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datacatalog.v1beta1.Taxonomy,
                com.google.cloud.datacatalog.v1beta1.Taxonomy.Builder,
                com.google.cloud.datacatalog.v1beta1.TaxonomyOrBuilder>(
                taxonomies_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        taxonomies_ = null;
      }
      return taxonomiesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse)
  private static final com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse();
  }

  public static com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTaxonomiesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListTaxonomiesResponse>() {
        @java.lang.Override
        public ListTaxonomiesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListTaxonomiesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListTaxonomiesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTaxonomiesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.ListTaxonomiesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
