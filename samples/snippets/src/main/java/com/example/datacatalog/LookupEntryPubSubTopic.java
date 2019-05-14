/*
 * Copyright 2019 Google Inc.
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

import com.google.cloud.datacatalog.Entry;
import com.google.cloud.datacatalog.LookupEntryRequest;
import com.google.cloud.datacatalog.v1beta1.DataCatalogClient;

public class LookupEntryPubSubTopic {

  /**
   * Lookup the Data Catalog entry referring to a BigQuery Dataset
   *
   * @param projectId The project ID to which the Dataset belongs, e.g. 'my-project'
   * @param topicId The topic ID to which the Catalog Entry refers, e.g. 'my-topic'
   */
  public static void lookupEntry(String projectId, String topicId) {
    // String projectId = "my-project"
    // String topicId = "my-topic"

    // Get an entry by the resource name from the source Google Cloud Platform service.
    String linkedResource =
        String.format("//pubsub.googleapis.com/projects/%s/topics/%s", projectId, topicId);
    LookupEntryRequest request =
        LookupEntryRequest.newBuilder().setLinkedResource(linkedResource).build();

    // Alternatively, lookup by the SQL name of the entry would have the same result:
    // String sqlResource = String.format("pubsub.topic.`%s`.`%s`", projectId, topicId);
    // LookupEntryRequest request =
    // LookupEntryRequest.newBuilder().setSqlResource(sqlResource).build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
      Entry entry = dataCatalogClient.lookupEntry(request);
      System.out.printf("Entry name: %s\n", entry.getName());
    } catch (Exception e) {
      System.out.print("Error during lookupEntryPubSubTopic:\n" + e.toString());
    }
  }
}
