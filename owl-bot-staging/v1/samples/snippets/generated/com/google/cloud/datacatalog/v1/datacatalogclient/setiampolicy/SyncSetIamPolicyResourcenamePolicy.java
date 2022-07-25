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

// [START datacatalog_v1_generated_datacatalogclient_setiampolicy_resourcenamepolicy_sync]
import com.google.api.resourcenames.ResourceName;
import com.google.cloud.datacatalog.v1.DataCatalogClient;
import com.google.cloud.datacatalog.v1.EntryGroupName;
import com.google.iam.v1.Policy;

public class SyncSetIamPolicyResourcenamePolicy {

  public static void main(String[] args) throws Exception {
    syncSetIamPolicyResourcenamePolicy();
  }

  public static void syncSetIamPolicyResourcenamePolicy() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
      ResourceName resource = EntryGroupName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]");
      Policy policy = Policy.newBuilder().build();
      Policy response = dataCatalogClient.setIamPolicy(resource, policy);
    }
  }
}
// [END datacatalog_v1_generated_datacatalogclient_setiampolicy_resourcenamepolicy_sync]
