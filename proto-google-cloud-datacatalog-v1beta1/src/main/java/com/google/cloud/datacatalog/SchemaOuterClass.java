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

package com.google.cloud.datacatalog;

public final class SchemaOuterClass {
  private SchemaOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_Schema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/datacatalog/v1beta1/schem"
          + "a.proto\022 google.cloud.datacatalog.v1beta"
          + "1\032\037google/api/field_behavior.proto\"N\n\006Sc"
          + "hema\022D\n\007columns\030\002 \003(\0132..google.cloud.dat"
          + "acatalog.v1beta1.ColumnSchemaB\003\340A\002\"\254\001\n\014C"
          + "olumnSchema\022\023\n\006column\030\006 \001(\tB\003\340A\002\022\021\n\004type"
          + "\030\001 \001(\tB\003\340A\002\022\030\n\013description\030\002 \001(\tB\003\340A\001\022\021\n"
          + "\004mode\030\003 \001(\tB\003\340A\001\022G\n\nsubcolumns\030\007 \003(\0132..g"
          + "oogle.cloud.datacatalog.v1beta1.ColumnSc"
          + "hemaB\003\340A\001Bp\n\034com.google.cloud.datacatalo"
          + "gP\001ZKgoogle.golang.org/genproto/googleap"
          + "is/cloud/datacatalog/v1beta1;datacatalog"
          + "\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_datacatalog_v1beta1_Schema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_Schema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_Schema_descriptor,
            new java.lang.String[] {
              "Columns",
            });
    internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_ColumnSchema_descriptor,
            new java.lang.String[] {
              "Column", "Type", "Description", "Mode", "Subcolumns",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
