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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface SearchCatalogRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.SearchCatalogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The scope of this search request. A `scope` that has empty
   * `include_org_ids`, `include_project_ids` AND false
   * `include_gcp_public_datasets` is considered invalid. Data Catalog will
   * return an error in such a case.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SearchCatalogRequest.Scope scope = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the scope field is set.
   */
  boolean hasScope();
  /**
   *
   *
   * <pre>
   * Required. The scope of this search request. A `scope` that has empty
   * `include_org_ids`, `include_project_ids` AND false
   * `include_gcp_public_datasets` is considered invalid. Data Catalog will
   * return an error in such a case.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SearchCatalogRequest.Scope scope = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The scope.
   */
  com.google.cloud.datacatalog.v1.SearchCatalogRequest.Scope getScope();
  /**
   *
   *
   * <pre>
   * Required. The scope of this search request. A `scope` that has empty
   * `include_org_ids`, `include_project_ids` AND false
   * `include_gcp_public_datasets` is considered invalid. Data Catalog will
   * return an error in such a case.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SearchCatalogRequest.Scope scope = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1.SearchCatalogRequest.ScopeOrBuilder getScopeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The query string in search query syntax. The query must be
   * non-empty.
   * Query strings can be simple as "x" or more qualified as:
   * * name:x
   * * column:x
   * * description:y
   * Note: Query tokens need to have a minimum of 3 characters for substring
   * matching to work correctly. See [Data Catalog Search
   * Syntax](https://cloud.google.com/data-catalog/docs/how-to/search-reference)
   * for more information.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. The query string in search query syntax. The query must be
   * non-empty.
   * Query strings can be simple as "x" or more qualified as:
   * * name:x
   * * column:x
   * * description:y
   * Note: Query tokens need to have a minimum of 3 characters for substring
   * matching to work correctly. See [Data Catalog Search
   * Syntax](https://cloud.google.com/data-catalog/docs/how-to/search-reference)
   * for more information.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Number of results in the search page. If &lt;=0 then defaults to 10. Max limit
   * for page_size is 1000. Throws an invalid argument for page_size &gt; 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Pagination token returned in an earlier
   * [SearchCatalogResponse.next_page_token][google.cloud.datacatalog.v1.SearchCatalogResponse.next_page_token],
   * which indicates that this is a continuation of a prior
   * [SearchCatalogRequest][google.cloud.datacatalog.v1.DataCatalog.SearchCatalog]
   * call, and that the system should return the next page of data. If empty,
   * the first page is returned.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Pagination token returned in an earlier
   * [SearchCatalogResponse.next_page_token][google.cloud.datacatalog.v1.SearchCatalogResponse.next_page_token],
   * which indicates that this is a continuation of a prior
   * [SearchCatalogRequest][google.cloud.datacatalog.v1.DataCatalog.SearchCatalog]
   * call, and that the system should return the next page of data. If empty,
   * the first page is returned.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Specifies the ordering of results, currently supported case-sensitive
   * choices are:
   *   * `relevance`, only supports descending
   *   * `last_modified_timestamp [asc|desc]`, defaults to descending if not
   *     specified
   * If not specified, defaults to `relevance` descending.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Specifies the ordering of results, currently supported case-sensitive
   * choices are:
   *   * `relevance`, only supports descending
   *   * `last_modified_timestamp [asc|desc]`, defaults to descending if not
   *     specified
   * If not specified, defaults to `relevance` descending.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
