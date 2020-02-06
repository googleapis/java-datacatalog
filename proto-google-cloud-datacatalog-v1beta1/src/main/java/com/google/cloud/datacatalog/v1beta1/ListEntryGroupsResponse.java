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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [ListEntryGroups][google.cloud.datacatalog.v1beta1.DataCatalog.ListEntryGroups].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse}
 */
public final class ListEntryGroupsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse)
    ListEntryGroupsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListEntryGroupsResponse.newBuilder() to construct.
  private ListEntryGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListEntryGroupsResponse() {
    entryGroups_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListEntryGroupsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListEntryGroupsResponse(
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
                entryGroups_ =
                    new java.util.ArrayList<com.google.cloud.datacatalog.v1beta1.EntryGroup>();
                mutable_bitField0_ |= 0x00000001;
              }
              entryGroups_.add(
                  input.readMessage(
                      com.google.cloud.datacatalog.v1beta1.EntryGroup.parser(), extensionRegistry));
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
        entryGroups_ = java.util.Collections.unmodifiableList(entryGroups_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_ListEntryGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_ListEntryGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse.class,
            com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse.Builder.class);
  }

  public static final int ENTRY_GROUPS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datacatalog.v1beta1.EntryGroup> entryGroups_;
  /**
   *
   *
   * <pre>
   * EntryGroup details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
   */
  public java.util.List<com.google.cloud.datacatalog.v1beta1.EntryGroup> getEntryGroupsList() {
    return entryGroups_;
  }
  /**
   *
   *
   * <pre>
   * EntryGroup details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.datacatalog.v1beta1.EntryGroupOrBuilder>
      getEntryGroupsOrBuilderList() {
    return entryGroups_;
  }
  /**
   *
   *
   * <pre>
   * EntryGroup details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
   */
  public int getEntryGroupsCount() {
    return entryGroups_.size();
  }
  /**
   *
   *
   * <pre>
   * EntryGroup details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
   */
  public com.google.cloud.datacatalog.v1beta1.EntryGroup getEntryGroups(int index) {
    return entryGroups_.get(index);
  }
  /**
   *
   *
   * <pre>
   * EntryGroup details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
   */
  public com.google.cloud.datacatalog.v1beta1.EntryGroupOrBuilder getEntryGroupsOrBuilder(
      int index) {
    return entryGroups_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results. It is set to empty if no items
   * remain in results.
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
   * Token to retrieve the next page of results. It is set to empty if no items
   * remain in results.
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
    for (int i = 0; i < entryGroups_.size(); i++) {
      output.writeMessage(1, entryGroups_.get(i));
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
    for (int i = 0; i < entryGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, entryGroups_.get(i));
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse other =
        (com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse) obj;

    if (!getEntryGroupsList().equals(other.getEntryGroupsList())) return false;
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
    if (getEntryGroupsCount() > 0) {
      hash = (37 * hash) + ENTRY_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getEntryGroupsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parseFrom(
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
      com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse prototype) {
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
   * [ListEntryGroups][google.cloud.datacatalog.v1beta1.DataCatalog.ListEntryGroups].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse)
      com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_ListEntryGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_ListEntryGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse.class,
              com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEntryGroupsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entryGroupsBuilder_ == null) {
        entryGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        entryGroupsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_ListEntryGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse build() {
      com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse buildPartial() {
      com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse result =
          new com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse(this);
      int from_bitField0_ = bitField0_;
      if (entryGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entryGroups_ = java.util.Collections.unmodifiableList(entryGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entryGroups_ = entryGroups_;
      } else {
        result.entryGroups_ = entryGroupsBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse other) {
      if (other
          == com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse.getDefaultInstance())
        return this;
      if (entryGroupsBuilder_ == null) {
        if (!other.entryGroups_.isEmpty()) {
          if (entryGroups_.isEmpty()) {
            entryGroups_ = other.entryGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntryGroupsIsMutable();
            entryGroups_.addAll(other.entryGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.entryGroups_.isEmpty()) {
          if (entryGroupsBuilder_.isEmpty()) {
            entryGroupsBuilder_.dispose();
            entryGroupsBuilder_ = null;
            entryGroups_ = other.entryGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entryGroupsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEntryGroupsFieldBuilder()
                    : null;
          } else {
            entryGroupsBuilder_.addAllMessages(other.entryGroups_);
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
      com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.datacatalog.v1beta1.EntryGroup> entryGroups_ =
        java.util.Collections.emptyList();

    private void ensureEntryGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entryGroups_ =
            new java.util.ArrayList<com.google.cloud.datacatalog.v1beta1.EntryGroup>(entryGroups_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.EntryGroup,
            com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder,
            com.google.cloud.datacatalog.v1beta1.EntryGroupOrBuilder>
        entryGroupsBuilder_;

    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1beta1.EntryGroup> getEntryGroupsList() {
      if (entryGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entryGroups_);
      } else {
        return entryGroupsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public int getEntryGroupsCount() {
      if (entryGroupsBuilder_ == null) {
        return entryGroups_.size();
      } else {
        return entryGroupsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.EntryGroup getEntryGroups(int index) {
      if (entryGroupsBuilder_ == null) {
        return entryGroups_.get(index);
      } else {
        return entryGroupsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public Builder setEntryGroups(
        int index, com.google.cloud.datacatalog.v1beta1.EntryGroup value) {
      if (entryGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryGroupsIsMutable();
        entryGroups_.set(index, value);
        onChanged();
      } else {
        entryGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public Builder setEntryGroups(
        int index, com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder builderForValue) {
      if (entryGroupsBuilder_ == null) {
        ensureEntryGroupsIsMutable();
        entryGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        entryGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public Builder addEntryGroups(com.google.cloud.datacatalog.v1beta1.EntryGroup value) {
      if (entryGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryGroupsIsMutable();
        entryGroups_.add(value);
        onChanged();
      } else {
        entryGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public Builder addEntryGroups(
        int index, com.google.cloud.datacatalog.v1beta1.EntryGroup value) {
      if (entryGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryGroupsIsMutable();
        entryGroups_.add(index, value);
        onChanged();
      } else {
        entryGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public Builder addEntryGroups(
        com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder builderForValue) {
      if (entryGroupsBuilder_ == null) {
        ensureEntryGroupsIsMutable();
        entryGroups_.add(builderForValue.build());
        onChanged();
      } else {
        entryGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public Builder addEntryGroups(
        int index, com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder builderForValue) {
      if (entryGroupsBuilder_ == null) {
        ensureEntryGroupsIsMutable();
        entryGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        entryGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public Builder addAllEntryGroups(
        java.lang.Iterable<? extends com.google.cloud.datacatalog.v1beta1.EntryGroup> values) {
      if (entryGroupsBuilder_ == null) {
        ensureEntryGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entryGroups_);
        onChanged();
      } else {
        entryGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public Builder clearEntryGroups() {
      if (entryGroupsBuilder_ == null) {
        entryGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entryGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public Builder removeEntryGroups(int index) {
      if (entryGroupsBuilder_ == null) {
        ensureEntryGroupsIsMutable();
        entryGroups_.remove(index);
        onChanged();
      } else {
        entryGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder getEntryGroupsBuilder(
        int index) {
      return getEntryGroupsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.EntryGroupOrBuilder getEntryGroupsOrBuilder(
        int index) {
      if (entryGroupsBuilder_ == null) {
        return entryGroups_.get(index);
      } else {
        return entryGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datacatalog.v1beta1.EntryGroupOrBuilder>
        getEntryGroupsOrBuilderList() {
      if (entryGroupsBuilder_ != null) {
        return entryGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entryGroups_);
      }
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder addEntryGroupsBuilder() {
      return getEntryGroupsFieldBuilder()
          .addBuilder(com.google.cloud.datacatalog.v1beta1.EntryGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder addEntryGroupsBuilder(
        int index) {
      return getEntryGroupsFieldBuilder()
          .addBuilder(index, com.google.cloud.datacatalog.v1beta1.EntryGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * EntryGroup details.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.EntryGroup entry_groups = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder>
        getEntryGroupsBuilderList() {
      return getEntryGroupsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.EntryGroup,
            com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder,
            com.google.cloud.datacatalog.v1beta1.EntryGroupOrBuilder>
        getEntryGroupsFieldBuilder() {
      if (entryGroupsBuilder_ == null) {
        entryGroupsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datacatalog.v1beta1.EntryGroup,
                com.google.cloud.datacatalog.v1beta1.EntryGroup.Builder,
                com.google.cloud.datacatalog.v1beta1.EntryGroupOrBuilder>(
                entryGroups_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        entryGroups_ = null;
      }
      return entryGroupsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results. It is set to empty if no items
     * remain in results.
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
     * Token to retrieve the next page of results. It is set to empty if no items
     * remain in results.
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
     * Token to retrieve the next page of results. It is set to empty if no items
     * remain in results.
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
     * Token to retrieve the next page of results. It is set to empty if no items
     * remain in results.
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
     * Token to retrieve the next page of results. It is set to empty if no items
     * remain in results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse)
  private static final com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse();
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEntryGroupsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListEntryGroupsResponse>() {
        @java.lang.Override
        public ListEntryGroupsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListEntryGroupsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListEntryGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEntryGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.ListEntryGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
