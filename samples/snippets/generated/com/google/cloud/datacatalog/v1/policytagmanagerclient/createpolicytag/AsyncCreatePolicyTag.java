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

// [START datacatalog_v1_generated_policytagmanagerclient_createpolicytag_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datacatalog.v1.CreatePolicyTagRequest;
import com.google.cloud.datacatalog.v1.PolicyTag;
import com.google.cloud.datacatalog.v1.PolicyTagManagerClient;
import com.google.cloud.datacatalog.v1.TaxonomyName;

public class AsyncCreatePolicyTag {

  public static void main(String[] args) throws Exception {
    asyncCreatePolicyTag();
  }

  public static void asyncCreatePolicyTag() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
      CreatePolicyTagRequest request =
          CreatePolicyTagRequest.newBuilder()
              .setParent(TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]").toString())
              .setPolicyTag(PolicyTag.newBuilder().build())
              .build();
      ApiFuture<PolicyTag> future =
          policyTagManagerClient.createPolicyTagCallable().futureCall(request);
      // Do something.
      PolicyTag response = future.get();
    }
  }
}
// [END datacatalog_v1_generated_policytagmanagerclient_createpolicytag_async]
