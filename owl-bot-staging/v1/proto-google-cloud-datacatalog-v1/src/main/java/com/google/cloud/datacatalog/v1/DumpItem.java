// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/dump_content.proto

package com.google.cloud.datacatalog.v1;

/**
 * <pre>
 * Wrapper for any item that can be contained in the dump.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.DumpItem}
 */
public final class DumpItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.DumpItem)
    DumpItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DumpItem.newBuilder() to construct.
  private DumpItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DumpItem() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DumpItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.v1.DumpContentProto.internal_static_google_cloud_datacatalog_v1_DumpItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.DumpContentProto.internal_static_google_cloud_datacatalog_v1_DumpItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.DumpItem.class, com.google.cloud.datacatalog.v1.DumpItem.Builder.class);
  }

  private int itemCase_ = 0;
  private java.lang.Object item_;
  public enum ItemCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TAGGED_ENTRY(1),
    ITEM_NOT_SET(0);
    private final int value;
    private ItemCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ItemCase valueOf(int value) {
      return forNumber(value);
    }

    public static ItemCase forNumber(int value) {
      switch (value) {
        case 1: return TAGGED_ENTRY;
        case 0: return ITEM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ItemCase
  getItemCase() {
    return ItemCase.forNumber(
        itemCase_);
  }

  public static final int TAGGED_ENTRY_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Entry and its tags.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
   * @return Whether the taggedEntry field is set.
   */
  @java.lang.Override
  public boolean hasTaggedEntry() {
    return itemCase_ == 1;
  }
  /**
   * <pre>
   * Entry and its tags.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
   * @return The taggedEntry.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.TaggedEntry getTaggedEntry() {
    if (itemCase_ == 1) {
       return (com.google.cloud.datacatalog.v1.TaggedEntry) item_;
    }
    return com.google.cloud.datacatalog.v1.TaggedEntry.getDefaultInstance();
  }
  /**
   * <pre>
   * Entry and its tags.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.TaggedEntryOrBuilder getTaggedEntryOrBuilder() {
    if (itemCase_ == 1) {
       return (com.google.cloud.datacatalog.v1.TaggedEntry) item_;
    }
    return com.google.cloud.datacatalog.v1.TaggedEntry.getDefaultInstance();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (itemCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.datacatalog.v1.TaggedEntry) item_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (itemCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.datacatalog.v1.TaggedEntry) item_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.datacatalog.v1.DumpItem)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.DumpItem other = (com.google.cloud.datacatalog.v1.DumpItem) obj;

    if (!getItemCase().equals(other.getItemCase())) return false;
    switch (itemCase_) {
      case 1:
        if (!getTaggedEntry()
            .equals(other.getTaggedEntry())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (itemCase_) {
      case 1:
        hash = (37 * hash) + TAGGED_ENTRY_FIELD_NUMBER;
        hash = (53 * hash) + getTaggedEntry().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.DumpItem parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.datacatalog.v1.DumpItem prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Wrapper for any item that can be contained in the dump.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.DumpItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.DumpItem)
      com.google.cloud.datacatalog.v1.DumpItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1.DumpContentProto.internal_static_google_cloud_datacatalog_v1_DumpItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.DumpContentProto.internal_static_google_cloud_datacatalog_v1_DumpItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.DumpItem.class, com.google.cloud.datacatalog.v1.DumpItem.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.DumpItem.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (taggedEntryBuilder_ != null) {
        taggedEntryBuilder_.clear();
      }
      itemCase_ = 0;
      item_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.DumpContentProto.internal_static_google_cloud_datacatalog_v1_DumpItem_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DumpItem getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.DumpItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DumpItem build() {
      com.google.cloud.datacatalog.v1.DumpItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DumpItem buildPartial() {
      com.google.cloud.datacatalog.v1.DumpItem result = new com.google.cloud.datacatalog.v1.DumpItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.DumpItem result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.datacatalog.v1.DumpItem result) {
      result.itemCase_ = itemCase_;
      result.item_ = this.item_;
      if (itemCase_ == 1 &&
          taggedEntryBuilder_ != null) {
        result.item_ = taggedEntryBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.v1.DumpItem) {
        return mergeFrom((com.google.cloud.datacatalog.v1.DumpItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.DumpItem other) {
      if (other == com.google.cloud.datacatalog.v1.DumpItem.getDefaultInstance()) return this;
      switch (other.getItemCase()) {
        case TAGGED_ENTRY: {
          mergeTaggedEntry(other.getTaggedEntry());
          break;
        }
        case ITEM_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getTaggedEntryFieldBuilder().getBuilder(),
                  extensionRegistry);
              itemCase_ = 1;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int itemCase_ = 0;
    private java.lang.Object item_;
    public ItemCase
        getItemCase() {
      return ItemCase.forNumber(
          itemCase_);
    }

    public Builder clearItem() {
      itemCase_ = 0;
      item_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.TaggedEntry, com.google.cloud.datacatalog.v1.TaggedEntry.Builder, com.google.cloud.datacatalog.v1.TaggedEntryOrBuilder> taggedEntryBuilder_;
    /**
     * <pre>
     * Entry and its tags.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
     * @return Whether the taggedEntry field is set.
     */
    @java.lang.Override
    public boolean hasTaggedEntry() {
      return itemCase_ == 1;
    }
    /**
     * <pre>
     * Entry and its tags.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
     * @return The taggedEntry.
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.TaggedEntry getTaggedEntry() {
      if (taggedEntryBuilder_ == null) {
        if (itemCase_ == 1) {
          return (com.google.cloud.datacatalog.v1.TaggedEntry) item_;
        }
        return com.google.cloud.datacatalog.v1.TaggedEntry.getDefaultInstance();
      } else {
        if (itemCase_ == 1) {
          return taggedEntryBuilder_.getMessage();
        }
        return com.google.cloud.datacatalog.v1.TaggedEntry.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Entry and its tags.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
     */
    public Builder setTaggedEntry(com.google.cloud.datacatalog.v1.TaggedEntry value) {
      if (taggedEntryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        taggedEntryBuilder_.setMessage(value);
      }
      itemCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Entry and its tags.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
     */
    public Builder setTaggedEntry(
        com.google.cloud.datacatalog.v1.TaggedEntry.Builder builderForValue) {
      if (taggedEntryBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        taggedEntryBuilder_.setMessage(builderForValue.build());
      }
      itemCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Entry and its tags.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
     */
    public Builder mergeTaggedEntry(com.google.cloud.datacatalog.v1.TaggedEntry value) {
      if (taggedEntryBuilder_ == null) {
        if (itemCase_ == 1 &&
            item_ != com.google.cloud.datacatalog.v1.TaggedEntry.getDefaultInstance()) {
          item_ = com.google.cloud.datacatalog.v1.TaggedEntry.newBuilder((com.google.cloud.datacatalog.v1.TaggedEntry) item_)
              .mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        if (itemCase_ == 1) {
          taggedEntryBuilder_.mergeFrom(value);
        } else {
          taggedEntryBuilder_.setMessage(value);
        }
      }
      itemCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Entry and its tags.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
     */
    public Builder clearTaggedEntry() {
      if (taggedEntryBuilder_ == null) {
        if (itemCase_ == 1) {
          itemCase_ = 0;
          item_ = null;
          onChanged();
        }
      } else {
        if (itemCase_ == 1) {
          itemCase_ = 0;
          item_ = null;
        }
        taggedEntryBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Entry and its tags.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.TaggedEntry.Builder getTaggedEntryBuilder() {
      return getTaggedEntryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Entry and its tags.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.TaggedEntryOrBuilder getTaggedEntryOrBuilder() {
      if ((itemCase_ == 1) && (taggedEntryBuilder_ != null)) {
        return taggedEntryBuilder_.getMessageOrBuilder();
      } else {
        if (itemCase_ == 1) {
          return (com.google.cloud.datacatalog.v1.TaggedEntry) item_;
        }
        return com.google.cloud.datacatalog.v1.TaggedEntry.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Entry and its tags.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.TaggedEntry tagged_entry = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.TaggedEntry, com.google.cloud.datacatalog.v1.TaggedEntry.Builder, com.google.cloud.datacatalog.v1.TaggedEntryOrBuilder> 
        getTaggedEntryFieldBuilder() {
      if (taggedEntryBuilder_ == null) {
        if (!(itemCase_ == 1)) {
          item_ = com.google.cloud.datacatalog.v1.TaggedEntry.getDefaultInstance();
        }
        taggedEntryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.TaggedEntry, com.google.cloud.datacatalog.v1.TaggedEntry.Builder, com.google.cloud.datacatalog.v1.TaggedEntryOrBuilder>(
                (com.google.cloud.datacatalog.v1.TaggedEntry) item_,
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      itemCase_ = 1;
      onChanged();
      return taggedEntryBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.DumpItem)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.DumpItem)
  private static final com.google.cloud.datacatalog.v1.DumpItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.DumpItem();
  }

  public static com.google.cloud.datacatalog.v1.DumpItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DumpItem>
      PARSER = new com.google.protobuf.AbstractParser<DumpItem>() {
    @java.lang.Override
    public DumpItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DumpItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DumpItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DumpItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

