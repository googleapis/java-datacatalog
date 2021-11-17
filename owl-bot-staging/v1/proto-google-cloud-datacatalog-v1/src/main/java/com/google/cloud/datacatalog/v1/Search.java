// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/search.proto

package com.google.cloud.datacatalog.v1;

public final class Search {
  private Search() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_SearchCatalogResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_SearchCatalogResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/datacatalog/v1/search.pro" +
      "to\022\033google.cloud.datacatalog.v1\032\037google/" +
      "api/field_behavior.proto\032(google/cloud/d" +
      "atacatalog/v1/common.proto\032\037google/proto" +
      "buf/timestamp.proto\"\256\003\n\023SearchCatalogRes" +
      "ult\022I\n\022search_result_type\030\001 \001(\0162-.google" +
      ".cloud.datacatalog.v1.SearchResultType\022\035" +
      "\n\025search_result_subtype\030\002 \001(\t\022\036\n\026relativ" +
      "e_resource_name\030\003 \001(\t\022\027\n\017linked_resource" +
      "\030\004 \001(\t\022/\n\013modify_time\030\007 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\022O\n\021integrated_system\030\010 \001" +
      "(\0162-.google.cloud.datacatalog.v1.Integra" +
      "tedSystemB\003\340A\003H\000\022\037\n\025user_specified_syste" +
      "m\030\t \001(\tH\000\022\034\n\024fully_qualified_name\030\n \001(\t\022" +
      "\024\n\014display_name\030\014 \001(\t\022\023\n\013description\030\r \001" +
      "(\tB\010\n\006system*d\n\020SearchResultType\022\"\n\036SEAR" +
      "CH_RESULT_TYPE_UNSPECIFIED\020\000\022\t\n\005ENTRY\020\001\022" +
      "\020\n\014TAG_TEMPLATE\020\002\022\017\n\013ENTRY_GROUP\020\003B\313\001\n\037c" +
      "om.google.cloud.datacatalog.v1P\001ZFgoogle" +
      ".golang.org/genproto/googleapis/cloud/da" +
      "tacatalog/v1;datacatalog\370\001\001\252\002\033Google.Clo" +
      "ud.DataCatalog.V1\312\002\033Google\\Cloud\\DataCat" +
      "alog\\V1\352\002\036Google::Cloud::DataCatalog::V1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.datacatalog.v1.Common.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1_SearchCatalogResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_SearchCatalogResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_SearchCatalogResult_descriptor,
        new java.lang.String[] { "SearchResultType", "SearchResultSubtype", "RelativeResourceName", "LinkedResource", "ModifyTime", "IntegratedSystem", "UserSpecifiedSystem", "FullyQualifiedName", "DisplayName", "Description", "System", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.datacatalog.v1.Common.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
