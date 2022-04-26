// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/dataplex_spec.proto

package com.google.cloud.datacatalog.v1;

public final class DataplexSpecProto {
  private DataplexSpecProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_DataplexSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DataplexSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_DataplexTableSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DataplexTableSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/datacatalog/v1/dataplex_s" +
      "pec.proto\022\033google.cloud.datacatalog.v1\032(" +
      "google/cloud/datacatalog/v1/common.proto" +
      "\0321google/cloud/datacatalog/v1/physical_s" +
      "chema.proto\"\217\001\n\014DataplexSpec\022\r\n\005asset\030\001 " +
      "\001(\t\022@\n\013data_format\030\002 \001(\0132+.google.cloud." +
      "datacatalog.v1.PhysicalSchema\022\032\n\022compres" +
      "sion_format\030\003 \001(\t\022\022\n\nproject_id\030\004 \001(\t\"W\n" +
      "\023DataplexFilesetSpec\022@\n\rdataplex_spec\030\001 " +
      "\001(\0132).google.cloud.datacatalog.v1.Datapl" +
      "exSpec\"\270\001\n\021DataplexTableSpec\022K\n\017external" +
      "_tables\030\001 \003(\01322.google.cloud.datacatalog" +
      ".v1.DataplexExternalTable\022@\n\rdataplex_sp" +
      "ec\030\002 \001(\0132).google.cloud.datacatalog.v1.D" +
      "ataplexSpec\022\024\n\014user_managed\030\003 \001(\010\"\257\001\n\025Da" +
      "taplexExternalTable\022=\n\006system\030\001 \001(\0162-.go" +
      "ogle.cloud.datacatalog.v1.IntegratedSyst" +
      "em\022\034\n\024fully_qualified_name\030\034 \001(\t\022\035\n\025goog" +
      "le_cloud_resource\030\003 \001(\t\022\032\n\022data_catalog_" +
      "entry\030\004 \001(\tB\336\001\n\037com.google.cloud.datacat" +
      "alog.v1B\021DataplexSpecProtoP\001ZFgoogle.gol" +
      "ang.org/genproto/googleapis/cloud/dataca" +
      "talog/v1;datacatalog\370\001\001\252\002\033Google.Cloud.D" +
      "ataCatalog.V1\312\002\033Google\\Cloud\\DataCatalog" +
      "\\V1\352\002\036Google::Cloud::DataCatalog::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.datacatalog.v1.Common.getDescriptor(),
          com.google.cloud.datacatalog.v1.PhysicalSchemaProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1_DataplexSpec_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_DataplexSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_DataplexSpec_descriptor,
        new java.lang.String[] { "Asset", "DataFormat", "CompressionFormat", "ProjectId", });
    internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_DataplexFilesetSpec_descriptor,
        new java.lang.String[] { "DataplexSpec", });
    internal_static_google_cloud_datacatalog_v1_DataplexTableSpec_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1_DataplexTableSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_DataplexTableSpec_descriptor,
        new java.lang.String[] { "ExternalTables", "DataplexSpec", "UserManaged", });
    internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_DataplexExternalTable_descriptor,
        new java.lang.String[] { "System", "FullyQualifiedName", "GoogleCloudResource", "DataCatalogEntry", });
    com.google.cloud.datacatalog.v1.Common.getDescriptor();
    com.google.cloud.datacatalog.v1.PhysicalSchemaProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
