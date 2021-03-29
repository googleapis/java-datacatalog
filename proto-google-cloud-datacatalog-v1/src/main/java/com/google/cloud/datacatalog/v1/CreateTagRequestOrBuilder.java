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

public interface CreateTagRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.CreateTagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the resource to attach this tag to. Tags can be attached to
   * entries. An entry can have up to 1000 attached tags. Example:
   * `projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}`
   * Note: The tag and its child resources might not be stored in
   * the location specified in its name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the resource to attach this tag to. Tags can be attached to
   * entries. An entry can have up to 1000 attached tags. Example:
   * `projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}`
   * Note: The tag and its child resources might not be stored in
   * the location specified in its name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The tag to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Tag tag = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tag field is set.
   */
  boolean hasTag();
  /**
   *
   *
   * <pre>
   * Required. The tag to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Tag tag = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tag.
   */
  com.google.cloud.datacatalog.v1.Tag getTag();
  /**
   *
   *
   * <pre>
   * Required. The tag to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Tag tag = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1.TagOrBuilder getTagOrBuilder();
}
