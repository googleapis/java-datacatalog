// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/common.proto

package com.google.cloud.datacatalog.v1;

public interface PersonalDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.PersonalDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * True if the entry is starred by the user; false otherwise.
   * </pre>
   *
   * <code>bool starred = 1;</code>
   * @return The starred.
   */
  boolean getStarred();

  /**
   * <pre>
   * Set if the entry is starred; unset otherwise.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp star_time = 2;</code>
   * @return Whether the starTime field is set.
   */
  boolean hasStarTime();
  /**
   * <pre>
   * Set if the entry is starred; unset otherwise.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp star_time = 2;</code>
   * @return The starTime.
   */
  com.google.protobuf.Timestamp getStarTime();
  /**
   * <pre>
   * Set if the entry is starred; unset otherwise.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp star_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStarTimeOrBuilder();
}
