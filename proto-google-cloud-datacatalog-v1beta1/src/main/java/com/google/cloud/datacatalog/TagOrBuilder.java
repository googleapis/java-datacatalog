/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/datacatalog/v1beta1/tags.proto

package com.google.cloud.datacatalog;

public interface TagOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.Tag)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required when used in
   * [UpdateTagRequest][google.cloud.datacatalog.v1beta1.UpdateTagRequest]. The
   * resource name of the tag in URL format. Example:
   * * projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}/tags/{tag_id}
   * where `tag_id` is a system-generated identifier.
   * Note that this Tag may not actually be stored in the location in this name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required when used in
   * [UpdateTagRequest][google.cloud.datacatalog.v1beta1.UpdateTagRequest]. The
   * resource name of the tag in URL format. Example:
   * * projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}/tags/{tag_id}
   * where `tag_id` is a system-generated identifier.
   * Note that this Tag may not actually be stored in the location in this name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the tag template that this tag uses.
   * Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}
   * This field cannot be modified after creation.
   * </pre>
   *
   * <code>string template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getTemplate();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the tag template that this tag uses.
   * Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}
   * This field cannot be modified after creation.
   * </pre>
   *
   * <code>string template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getTemplateBytes();

  /**
   *
   *
   * <pre>
   * Output only. The display name of the tag template.
   * </pre>
   *
   * <code>string template_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getTemplateDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The display name of the tag template.
   * </pre>
   *
   * <code>string template_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString getTemplateDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Resources like Entry can have schemas associated with them. This scope
   * allows users to attach tags to an individual column based on that schema.
   * For attaching a tag to a nested column, use `.` to separate the column
   * names. Example:
   * * `outer_column.inner_column`
   * </pre>
   *
   * <code>string column = 4;</code>
   */
  java.lang.String getColumn();
  /**
   *
   *
   * <pre>
   * Resources like Entry can have schemas associated with them. This scope
   * allows users to attach tags to an individual column based on that schema.
   * For attaching a tag to a nested column, use `.` to separate the column
   * names. Example:
   * * `outer_column.inner_column`
   * </pre>
   *
   * <code>string column = 4;</code>
   */
  com.google.protobuf.ByteString getColumnBytes();

  /**
   *
   *
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional
   * information about that field. Valid field IDs are defined by the tag's
   * template. A tag must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional
   * information about that field. Valid field IDs are defined by the tag's
   * template. A tag must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsFields(java.lang.String key);
  /** Use {@link #getFieldsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.TagField> getFields();
  /**
   *
   *
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional
   * information about that field. Valid field IDs are defined by the tag's
   * template. A tag must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.TagField> getFieldsMap();
  /**
   *
   *
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional
   * information about that field. Valid field IDs are defined by the tag's
   * template. A tag must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.TagField getFieldsOrDefault(
      java.lang.String key, com.google.cloud.datacatalog.TagField defaultValue);
  /**
   *
   *
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional
   * information about that field. Valid field IDs are defined by the tag's
   * template. A tag must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.TagField getFieldsOrThrow(java.lang.String key);

  public com.google.cloud.datacatalog.Tag.ScopeCase getScopeCase();
}
