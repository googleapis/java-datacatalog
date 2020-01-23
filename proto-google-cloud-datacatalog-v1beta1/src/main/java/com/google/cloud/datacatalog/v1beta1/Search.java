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
// source: google/cloud/datacatalog/v1beta1/search.proto

package com.google.cloud.datacatalog.v1beta1;

public final class Search {
  private Search() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/datacatalog/v1beta1/searc"
          + "h.proto\022 google.cloud.datacatalog.v1beta"
          + "1\032\037google/api/field_behavior.proto\032\037goog"
          + "le/protobuf/timestamp.proto\"\275\001\n\023SearchCa"
          + "talogResult\022N\n\022search_result_type\030\001 \001(\0162"
          + "2.google.cloud.datacatalog.v1beta1.Searc"
          + "hResultType\022\035\n\025search_result_subtype\030\002 \001"
          + "(\t\022\036\n\026relative_resource_name\030\003 \001(\t\022\027\n\017li"
          + "nked_resource\030\004 \001(\t*d\n\020SearchResultType\022"
          + "\"\n\036SEARCH_RESULT_TYPE_UNSPECIFIED\020\000\022\t\n\005E"
          + "NTRY\020\001\022\020\n\014TAG_TEMPLATE\020\002\022\017\n\013ENTRY_GROUP\020"
          + "\003Bx\n$com.google.cloud.datacatalog.v1beta"
          + "1P\001ZKgoogle.golang.org/genproto/googleap"
          + "is/cloud/datacatalog/v1beta1;datacatalog"
          + "\370\001\001b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor,
            new java.lang.String[] {
              "SearchResultType", "SearchResultSubtype", "RelativeResourceName", "LinkedResource",
            });
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
