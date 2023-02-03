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
// source: google/cloud/datacatalog/v1beta1/tags.proto

package com.google.cloud.datacatalog.v1beta1;

public final class Tags {
  private Tags() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_Tag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_Tag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_TagField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/datacatalog/v1beta1/tags."
          + "proto\022 google.cloud.datacatalog.v1beta1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\220\003\n\003Tag\022\014\n\004name\030\001 \001(\t\022\025\n\010te"
          + "mplate\030\002 \001(\tB\003\340A\002\022\"\n\025template_display_na"
          + "me\030\005 \001(\tB\003\340A\003\022\020\n\006column\030\004 \001(\tH\000\022F\n\006field"
          + "s\030\003 \003(\01321.google.cloud.datacatalog.v1bet"
          + "a1.Tag.FieldsEntryB\003\340A\002\032Y\n\013FieldsEntry\022\013"
          + "\n\003key\030\001 \001(\t\0229\n\005value\030\002 \001(\0132*.google.clou"
          + "d.datacatalog.v1beta1.TagField:\0028\001:\201\001\352A~"
          + "\n\036datacatalog.googleapis.com/Tag\022\\projec"
          + "ts/{project}/locations/{location}/entryG"
          + "roups/{entry_group}/entries/{entry}/tags"
          + "/{tag}B\007\n\005scope\"\255\002\n\010TagField\022\031\n\014display_"
          + "name\030\001 \001(\tB\003\340A\003\022\026\n\014double_value\030\002 \001(\001H\000\022"
          + "\026\n\014string_value\030\003 \001(\tH\000\022\024\n\nbool_value\030\004 "
          + "\001(\010H\000\0225\n\017timestamp_value\030\005 \001(\0132\032.google."
          + "protobuf.TimestampH\000\022J\n\nenum_value\030\006 \001(\013"
          + "24.google.cloud.datacatalog.v1beta1.TagF"
          + "ield.EnumValueH\000\022\022\n\005order\030\007 \001(\005B\003\340A\003\032!\n\t"
          + "EnumValue\022\024\n\014display_name\030\001 \001(\tB\006\n\004kind\""
          + "\326\002\n\013TagTemplate\022\014\n\004name\030\001 \001(\t\022\024\n\014display"
          + "_name\030\002 \001(\t\022N\n\006fields\030\003 \003(\01329.google.clo"
          + "ud.datacatalog.v1beta1.TagTemplate.Field"
          + "sEntryB\003\340A\002\032a\n\013FieldsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "A\n\005value\030\002 \001(\01322.google.cloud.datacatalo"
          + "g.v1beta1.TagTemplateField:\0028\001:p\352Am\n&dat"
          + "acatalog.googleapis.com/TagTemplate\022Cpro"
          + "jects/{project}/locations/{location}/tag"
          + "Templates/{tag_template}\"\247\002\n\020TagTemplate"
          + "Field\022\021\n\004name\030\006 \001(\tB\003\340A\003\022\024\n\014display_name"
          + "\030\001 \001(\t\022>\n\004type\030\002 \001(\0132+.google.cloud.data"
          + "catalog.v1beta1.FieldTypeB\003\340A\002\022\023\n\013is_req"
          + "uired\030\003 \001(\010\022\r\n\005order\030\005 \001(\005:\205\001\352A\201\001\n+datac"
          + "atalog.googleapis.com/TagTemplateField\022R"
          + "projects/{project}/locations/{location}/"
          + "tagTemplates/{tag_template}/fields/{fiel"
          + "d}\"\247\003\n\tFieldType\022S\n\016primitive_type\030\001 \001(\016"
          + "29.google.cloud.datacatalog.v1beta1.Fiel"
          + "dType.PrimitiveTypeH\000\022I\n\tenum_type\030\002 \001(\013"
          + "24.google.cloud.datacatalog.v1beta1.Fiel"
          + "dType.EnumTypeH\000\032\212\001\n\010EnumType\022V\n\016allowed"
          + "_values\030\001 \003(\0132>.google.cloud.datacatalog"
          + ".v1beta1.FieldType.EnumType.EnumValue\032&\n"
          + "\tEnumValue\022\031\n\014display_name\030\001 \001(\tB\003\340A\002\"`\n"
          + "\rPrimitiveType\022\036\n\032PRIMITIVE_TYPE_UNSPECI"
          + "FIED\020\000\022\n\n\006DOUBLE\020\001\022\n\n\006STRING\020\002\022\010\n\004BOOL\020\003"
          + "\022\r\n\tTIMESTAMP\020\004B\013\n\ttype_declB\337\001\n$com.goo"
          + "gle.cloud.datacatalog.v1beta1P\001ZFcloud.g"
          + "oogle.com/go/datacatalog/apiv1beta1/data"
          + "catalogpb;datacatalogpb\370\001\001\252\002 Google.Clou"
          + "d.DataCatalog.V1Beta1\312\002 Google\\Cloud\\Dat"
          + "aCatalog\\V1beta1\352\002#Google::Cloud::DataCa"
          + "talog::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1beta1_Tag_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_Tag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_Tag_descriptor,
            new java.lang.String[] {
              "Name", "Template", "TemplateDisplayName", "Column", "Fields", "Scope",
            });
    internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_descriptor =
        internal_static_google_cloud_datacatalog_v1beta1_Tag_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_Tag_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datacatalog_v1beta1_TagField_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1beta1_TagField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_TagField_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "DoubleValue",
              "StringValue",
              "BoolValue",
              "TimestampValue",
              "EnumValue",
              "Order",
              "Kind",
            });
    internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_descriptor =
        internal_static_google_cloud_datacatalog_v1beta1_TagField_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_TagField_EnumValue_descriptor,
            new java.lang.String[] {
              "DisplayName",
            });
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Fields",
            });
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_descriptor =
        internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_TagTemplate_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_TagTemplateField_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Type", "IsRequired", "Order",
            });
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_FieldType_descriptor,
            new java.lang.String[] {
              "PrimitiveType", "EnumType", "TypeDecl",
            });
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_descriptor =
        internal_static_google_cloud_datacatalog_v1beta1_FieldType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_descriptor,
            new java.lang.String[] {
              "AllowedValues",
            });
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_descriptor =
        internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_FieldType_EnumType_EnumValue_descriptor,
            new java.lang.String[] {
              "DisplayName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
