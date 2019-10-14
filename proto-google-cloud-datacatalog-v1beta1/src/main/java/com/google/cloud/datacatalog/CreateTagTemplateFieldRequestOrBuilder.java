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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface CreateTagTemplateFieldRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.CreateTagTemplateFieldRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project this template is in. Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project this template is in. Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID of the tag template field to create.
   * Field ids can contain letters (both uppercase and lowercase), numbers
   * (0-9), underscores (_) and dashes (-). Field IDs must be at least 1
   * character long and at most 128 characters long. Field IDs must also be
   * unique within their template.
   * </pre>
   *
   * <code>string tag_template_field_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getTagTemplateFieldId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the tag template field to create.
   * Field ids can contain letters (both uppercase and lowercase), numbers
   * (0-9), underscores (_) and dashes (-). Field IDs must be at least 1
   * character long and at most 128 characters long. Field IDs must also be
   * unique within their template.
   * </pre>
   *
   * <code>string tag_template_field_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getTagTemplateFieldIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The tag template field to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TagTemplateField tag_template_field = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasTagTemplateField();
  /**
   *
   *
   * <pre>
   * Required. The tag template field to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TagTemplateField tag_template_field = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.TagTemplateField getTagTemplateField();
  /**
   *
   *
   * <pre>
   * Required. The tag template field to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TagTemplateField tag_template_field = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.TagTemplateFieldOrBuilder getTagTemplateFieldOrBuilder();
}
