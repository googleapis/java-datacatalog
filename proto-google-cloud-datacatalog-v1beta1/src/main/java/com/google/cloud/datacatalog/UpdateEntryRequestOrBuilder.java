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

public interface UpdateEntryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.UpdateEntryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The updated entry. The "name" field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasEntry();
  /**
   *
   *
   * <pre>
   * Required. The updated entry. The "name" field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.Entry getEntry();
  /**
   *
   *
   * <pre>
   * Required. The updated entry. The "name" field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.EntryOrBuilder getEntryOrBuilder();

  /**
   *
   *
   * <pre>
   * The fields to update on the entry. If absent or empty, all modifiable
   * fields are updated.
   * The following fields are modifiable:
   * * For entries with type `DATA_STREAM`:
   *    * `schema`
   * * For entries with type `FILESET`
   *    * `schema`
   *    * `display_name`
   *    * `description`
   *    * `gcs_fileset_spec`
   *    * `gcs_fileset_spec.file_patterns`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update on the entry. If absent or empty, all modifiable
   * fields are updated.
   * The following fields are modifiable:
   * * For entries with type `DATA_STREAM`:
   *    * `schema`
   * * For entries with type `FILESET`
   *    * `schema`
   *    * `display_name`
   *    * `description`
   *    * `gcs_fileset_spec`
   *    * `gcs_fileset_spec.file_patterns`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update on the entry. If absent or empty, all modifiable
   * fields are updated.
   * The following fields are modifiable:
   * * For entries with type `DATA_STREAM`:
   *    * `schema`
   * * For entries with type `FILESET`
   *    * `schema`
   *    * `display_name`
   *    * `description`
   *    * `gcs_fileset_spec`
   *    * `gcs_fileset_spec.file_patterns`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
