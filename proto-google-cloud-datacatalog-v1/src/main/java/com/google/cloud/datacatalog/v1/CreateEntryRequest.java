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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [CreateEntry][google.cloud.datacatalog.v1.DataCatalog.CreateEntry].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.CreateEntryRequest}
 */
public final class CreateEntryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.CreateEntryRequest)
    CreateEntryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateEntryRequest.newBuilder() to construct.
  private CreateEntryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateEntryRequest() {
    parent_ = "";
    entryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateEntryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateEntryRequest(
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
              com.google.cloud.datacatalog.v1.Entry.Builder subBuilder = null;
              if (entry_ != null) {
                subBuilder = entry_.toBuilder();
              }
              entry_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.v1.Entry.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entry_);
                entry_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              entryId_ = s;
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
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.CreateEntryRequest.class,
            com.google.cloud.datacatalog.v1.CreateEntryRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the entry group this entry belongs to. Example:
   * `projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}`
   * Note: The entry itself and its child resources might not be stored in
   * the location specified in its name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
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
   * Required. The name of the entry group this entry belongs to. Example:
   * `projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}`
   * Note: The entry itself and its child resources might not be stored in
   * the location specified in its name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
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

  public static final int ENTRY_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object entryId_;
  /**
   *
   *
   * <pre>
   * Required. The ID of the entry to create.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * and underscores (_).
   * The maximum size is 64 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The entryId.
   */
  @java.lang.Override
  public java.lang.String getEntryId() {
    java.lang.Object ref = entryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entryId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the entry to create.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * and underscores (_).
   * The maximum size is 64 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for entryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntryIdBytes() {
    java.lang.Object ref = entryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTRY_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.Entry entry_;
  /**
   *
   *
   * <pre>
   * Required. The entry to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entry field is set.
   */
  @java.lang.Override
  public boolean hasEntry() {
    return entry_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The entry to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entry.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.Entry getEntry() {
    return entry_ == null ? com.google.cloud.datacatalog.v1.Entry.getDefaultInstance() : entry_;
  }
  /**
   *
   *
   * <pre>
   * Required. The entry to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.EntryOrBuilder getEntryOrBuilder() {
    return getEntry();
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
    if (entry_ != null) {
      output.writeMessage(2, getEntry());
    }
    if (!getEntryIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, entryId_);
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
    if (entry_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEntry());
    }
    if (!getEntryIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, entryId_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.CreateEntryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.CreateEntryRequest other =
        (com.google.cloud.datacatalog.v1.CreateEntryRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getEntryId().equals(other.getEntryId())) return false;
    if (hasEntry() != other.hasEntry()) return false;
    if (hasEntry()) {
      if (!getEntry().equals(other.getEntry())) return false;
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
    hash = (37 * hash) + ENTRY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntryId().hashCode();
    if (hasEntry()) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntry().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.CreateEntryRequest prototype) {
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
   * [CreateEntry][google.cloud.datacatalog.v1.DataCatalog.CreateEntry].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.CreateEntryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.CreateEntryRequest)
      com.google.cloud.datacatalog.v1.CreateEntryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.CreateEntryRequest.class,
              com.google.cloud.datacatalog.v1.CreateEntryRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.CreateEntryRequest.newBuilder()
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

      entryId_ = "";

      if (entryBuilder_ == null) {
        entry_ = null;
      } else {
        entry_ = null;
        entryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_CreateEntryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CreateEntryRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.CreateEntryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CreateEntryRequest build() {
      com.google.cloud.datacatalog.v1.CreateEntryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CreateEntryRequest buildPartial() {
      com.google.cloud.datacatalog.v1.CreateEntryRequest result =
          new com.google.cloud.datacatalog.v1.CreateEntryRequest(this);
      result.parent_ = parent_;
      result.entryId_ = entryId_;
      if (entryBuilder_ == null) {
        result.entry_ = entry_;
      } else {
        result.entry_ = entryBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.CreateEntryRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.CreateEntryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.CreateEntryRequest other) {
      if (other == com.google.cloud.datacatalog.v1.CreateEntryRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getEntryId().isEmpty()) {
        entryId_ = other.entryId_;
        onChanged();
      }
      if (other.hasEntry()) {
        mergeEntry(other.getEntry());
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
      com.google.cloud.datacatalog.v1.CreateEntryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.v1.CreateEntryRequest) e.getUnfinishedMessage();
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
     * Required. The name of the entry group this entry belongs to. Example:
     * `projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}`
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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
     * Required. The name of the entry group this entry belongs to. Example:
     * `projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}`
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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
     * Required. The name of the entry group this entry belongs to. Example:
     * `projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}`
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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
     * Required. The name of the entry group this entry belongs to. Example:
     * `projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}`
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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
     * Required. The name of the entry group this entry belongs to. Example:
     * `projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}`
     * Note: The entry itself and its child resources might not be stored in
     * the location specified in its name.
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

    private java.lang.Object entryId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The entryId.
     */
    public java.lang.String getEntryId() {
      java.lang.Object ref = entryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for entryId.
     */
    public com.google.protobuf.ByteString getEntryIdBytes() {
      java.lang.Object ref = entryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The entryId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      entryId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntryId() {

      entryId_ = getDefaultInstance().getEntryId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the entry to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * and underscores (_).
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for entryId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      entryId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1.Entry entry_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Entry,
            com.google.cloud.datacatalog.v1.Entry.Builder,
            com.google.cloud.datacatalog.v1.EntryOrBuilder>
        entryBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the entry field is set.
     */
    public boolean hasEntry() {
      return entryBuilder_ != null || entry_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The entry.
     */
    public com.google.cloud.datacatalog.v1.Entry getEntry() {
      if (entryBuilder_ == null) {
        return entry_ == null ? com.google.cloud.datacatalog.v1.Entry.getDefaultInstance() : entry_;
      } else {
        return entryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntry(com.google.cloud.datacatalog.v1.Entry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entry_ = value;
        onChanged();
      } else {
        entryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntry(com.google.cloud.datacatalog.v1.Entry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        entry_ = builderForValue.build();
        onChanged();
      } else {
        entryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntry(com.google.cloud.datacatalog.v1.Entry value) {
      if (entryBuilder_ == null) {
        if (entry_ != null) {
          entry_ =
              com.google.cloud.datacatalog.v1.Entry.newBuilder(entry_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          entry_ = value;
        }
        onChanged();
      } else {
        entryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = null;
        onChanged();
      } else {
        entry_ = null;
        entryBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.Entry.Builder getEntryBuilder() {

      onChanged();
      return getEntryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.EntryOrBuilder getEntryOrBuilder() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilder();
      } else {
        return entry_ == null ? com.google.cloud.datacatalog.v1.Entry.getDefaultInstance() : entry_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The entry to create.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.Entry entry = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Entry,
            com.google.cloud.datacatalog.v1.Entry.Builder,
            com.google.cloud.datacatalog.v1.EntryOrBuilder>
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.Entry,
                com.google.cloud.datacatalog.v1.Entry.Builder,
                com.google.cloud.datacatalog.v1.EntryOrBuilder>(
                getEntry(), getParentForChildren(), isClean());
        entry_ = null;
      }
      return entryBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.CreateEntryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.CreateEntryRequest)
  private static final com.google.cloud.datacatalog.v1.CreateEntryRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.CreateEntryRequest();
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEntryRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateEntryRequest>() {
        @java.lang.Override
        public CreateEntryRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateEntryRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateEntryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEntryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.CreateEntryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
