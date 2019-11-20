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
// source: google/cloud/datacatalog/v1beta1/schema.proto

package com.google.cloud.datacatalog.v1beta1;

public interface SchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns can be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.datacatalog.v1beta1.ColumnSchema> getColumnsList();
  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns can be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.ColumnSchema getColumns(int index);
  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns can be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getColumnsCount();
  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns can be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1beta1.ColumnSchemaOrBuilder>
      getColumnsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Schema of columns. A maximum of 10,000 columns and sub-columns can be
   * specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.v1beta1.ColumnSchema columns = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.ColumnSchemaOrBuilder getColumnsOrBuilder(int index);
}
