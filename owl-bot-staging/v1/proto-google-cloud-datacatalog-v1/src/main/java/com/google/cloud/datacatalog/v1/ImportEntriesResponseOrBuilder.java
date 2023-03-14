// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface ImportEntriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ImportEntriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Cumulative number of entries created and entries updated as a result of
   * import operation.
   * </pre>
   *
   * <code>optional int64 upserted_entries_count = 5;</code>
   * @return Whether the upsertedEntriesCount field is set.
   */
  boolean hasUpsertedEntriesCount();
  /**
   * <pre>
   * Cumulative number of entries created and entries updated as a result of
   * import operation.
   * </pre>
   *
   * <code>optional int64 upserted_entries_count = 5;</code>
   * @return The upsertedEntriesCount.
   */
  long getUpsertedEntriesCount();

  /**
   * <pre>
   * Number of entries deleted as a result of import operation.
   * </pre>
   *
   * <code>optional int64 deleted_entries_count = 6;</code>
   * @return Whether the deletedEntriesCount field is set.
   */
  boolean hasDeletedEntriesCount();
  /**
   * <pre>
   * Number of entries deleted as a result of import operation.
   * </pre>
   *
   * <code>optional int64 deleted_entries_count = 6;</code>
   * @return The deletedEntriesCount.
   */
  long getDeletedEntriesCount();
}
