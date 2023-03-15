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

// [START datacatalog_v1_generated_DataCatalog_ReconcileTags_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datacatalog.v1.DataCatalogClient;
import com.google.cloud.datacatalog.v1.EntryName;
import com.google.cloud.datacatalog.v1.ReconcileTagsRequest;
import com.google.cloud.datacatalog.v1.Tag;
import com.google.cloud.datacatalog.v1.TagTemplateName;
import com.google.longrunning.Operation;
import java.util.ArrayList;

public class AsyncReconcileTags {

  public static void main(String[] args) throws Exception {
    asyncReconcileTags();
  }

  public static void asyncReconcileTags() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
      ReconcileTagsRequest request =
          ReconcileTagsRequest.newBuilder()
              .setParent(
                  EntryName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]", "[ENTRY]").toString())
              .setTagTemplate(
                  TagTemplateName.of("[PROJECT]", "[LOCATION]", "[TAG_TEMPLATE]").toString())
              .setForceDeleteMissing(true)
              .addAllTags(new ArrayList<Tag>())
              .build();
      ApiFuture<Operation> future = dataCatalogClient.reconcileTagsCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END datacatalog_v1_generated_DataCatalog_ReconcileTags_async]
