// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1;

public interface InlineSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.InlineSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.SerializedTaxonomy> 
      getTaxonomiesList();
  /**
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1.SerializedTaxonomy getTaxonomies(int index);
  /**
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getTaxonomiesCount();
  /**
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder> 
      getTaxonomiesOrBuilderList();
  /**
   * <pre>
   * Required. Taxonomies to import.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder getTaxonomiesOrBuilder(
      int index);
}
