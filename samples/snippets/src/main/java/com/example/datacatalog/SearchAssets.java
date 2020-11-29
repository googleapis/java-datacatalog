/*
 * Copyright 2020 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.datacatalog;

// [START data_catalog_search_assets]

import com.google.cloud.datacatalog.v1.SearchCatalogRequest;
import com.google.cloud.datacatalog.v1.SearchCatalogRequest.Scope;
import com.google.cloud.datacatalog.v1.SearchCatalogResult;
import com.google.cloud.datacatalog.v1.DataCatalogClient;
import com.google.cloud.datacatalog.v1.DataCatalogClient.SearchCatalogPagedResponse;

public class SearchCatalog {

  public static void searchCatalog() {
    // TODO(developer): Replace these variables before running the sample.
    String orgId = "111111000000";
    String query = "type=dataset";
    searchCatalog(orgId, query);
  }

  /**
   * Search Data Catalog entries for a given organization.
   *
   * @param orgId The organization ID to which the search will be scoped, e.g. '111111000000'.
   * @param query The query, e.g. 'type:dataset'.
   */
  public static void searchCatalog(String orgId, String query) {
    // Create a scope object setting search boundaries to the given organization.
    Scope scope = Scope.newBuilder().addIncludeOrgIds(orgId).build();

    // Alternatively, search using project scopes.
    // Scope scope = Scope.newBuilder().addAllIncludeProjectIds("my-project").build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {

      // Search the catalog.
      SearchCatalogRequest searchCatalogRequest =
          SearchCatalogRequest.newBuilder().setScope(scope).setQuery(query).build();
      SearchCatalogPagedResponse response = dataCatalogClient.searchCatalog(searchCatalogRequest);

      System.out.println("Search results:");
      for (SearchCatalogResult result : response.iterateAll()) {
        System.out.println(result);
      }

    } catch (Exception e) {
      System.out.print("Error during SearchCatalog:\n" + e.toString());
    }
  }
}
// [END data_catalog_search_assets]