/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.datacatalog.v1.samples;

// [START datacatalog_v1_generated_policytagmanagerclient_updatetaxonomy_sync]
import com.google.cloud.datacatalog.v1.PolicyTagManagerClient;
import com.google.cloud.datacatalog.v1.Taxonomy;
import com.google.cloud.datacatalog.v1.UpdateTaxonomyRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdateTaxonomy {

  public static void main(String[] args) throws Exception {
    syncUpdateTaxonomy();
  }

  public static void syncUpdateTaxonomy() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
      UpdateTaxonomyRequest request =
          UpdateTaxonomyRequest.newBuilder()
              .setTaxonomy(Taxonomy.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      Taxonomy response = policyTagManagerClient.updateTaxonomy(request);
    }
  }
}
// [END datacatalog_v1_generated_policytagmanagerclient_updatetaxonomy_sync]
