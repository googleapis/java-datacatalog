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
package com.google.cloud.datacatalog.v1beta1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.datacatalog.v1beta1.stub.PolicyTagManagerStub;
import com.google.cloud.datacatalog.v1beta1.stub.PolicyTagManagerStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The policy tag manager API service allows clients to manage their taxonomies
 * and policy tags.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Taxonomy taxonomy = Taxonomy.newBuilder().build();
 *   Taxonomy response = policyTagManagerClient.createTaxonomy(parent, taxonomy);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the policyTagManagerClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of PolicyTagManagerSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * PolicyTagManagerSettings policyTagManagerSettings =
 *     PolicyTagManagerSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * PolicyTagManagerClient policyTagManagerClient =
 *     PolicyTagManagerClient.create(policyTagManagerSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * PolicyTagManagerSettings policyTagManagerSettings =
 *     PolicyTagManagerSettings.newBuilder().setEndpoint(myEndpoint).build();
 * PolicyTagManagerClient policyTagManagerClient =
 *     PolicyTagManagerClient.create(policyTagManagerSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class PolicyTagManagerClient implements BackgroundResource {
  private final PolicyTagManagerSettings settings;
  private final PolicyTagManagerStub stub;

  /** Constructs an instance of PolicyTagManagerClient with default settings. */
  public static final PolicyTagManagerClient create() throws IOException {
    return create(PolicyTagManagerSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of PolicyTagManagerClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final PolicyTagManagerClient create(PolicyTagManagerSettings settings)
      throws IOException {
    return new PolicyTagManagerClient(settings);
  }

  /**
   * Constructs an instance of PolicyTagManagerClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use PolicyTagManagerSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final PolicyTagManagerClient create(PolicyTagManagerStub stub) {
    return new PolicyTagManagerClient(stub);
  }

  /**
   * Constructs an instance of PolicyTagManagerClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected PolicyTagManagerClient(PolicyTagManagerSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((PolicyTagManagerStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected PolicyTagManagerClient(PolicyTagManagerStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final PolicyTagManagerSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public PolicyTagManagerStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a taxonomy in the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Taxonomy taxonomy = Taxonomy.newBuilder().build();
   *   Taxonomy response = policyTagManagerClient.createTaxonomy(parent, taxonomy);
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the project that the taxonomy will belong to.
   * @param taxonomy The taxonomy to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Taxonomy createTaxonomy(LocationName parent, Taxonomy taxonomy) {
    CreateTaxonomyRequest request =
        CreateTaxonomyRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTaxonomy(taxonomy)
            .build();
    return createTaxonomy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a taxonomy in the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Taxonomy taxonomy = Taxonomy.newBuilder().build();
   *   Taxonomy response = policyTagManagerClient.createTaxonomy(parent.toString(), taxonomy);
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the project that the taxonomy will belong to.
   * @param taxonomy The taxonomy to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Taxonomy createTaxonomy(String parent, Taxonomy taxonomy) {
    CreateTaxonomyRequest request =
        CreateTaxonomyRequest.newBuilder().setParent(parent).setTaxonomy(taxonomy).build();
    return createTaxonomy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a taxonomy in the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   CreateTaxonomyRequest request = CreateTaxonomyRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   Taxonomy response = policyTagManagerClient.createTaxonomy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Taxonomy createTaxonomy(CreateTaxonomyRequest request) {
    return createTaxonomyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a taxonomy in the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   CreateTaxonomyRequest request = CreateTaxonomyRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;Taxonomy&gt; future = policyTagManagerClient.createTaxonomyCallable().futureCall(request);
   *   // Do something
   *   Taxonomy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateTaxonomyRequest, Taxonomy> createTaxonomyCallable() {
    return stub.createTaxonomyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a taxonomy. This operation will also delete all policy tags in this taxonomy along with
   * their associated policies.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName name = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   policyTagManagerClient.deleteTaxonomy(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the taxonomy to be deleted. All policy tags in this
   *     taxonomy will also be deleted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTaxonomy(TaxonomyName name) {
    DeleteTaxonomyRequest request =
        DeleteTaxonomyRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteTaxonomy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a taxonomy. This operation will also delete all policy tags in this taxonomy along with
   * their associated policies.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName name = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   policyTagManagerClient.deleteTaxonomy(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the taxonomy to be deleted. All policy tags in this
   *     taxonomy will also be deleted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTaxonomy(String name) {
    DeleteTaxonomyRequest request = DeleteTaxonomyRequest.newBuilder().setName(name).build();
    deleteTaxonomy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a taxonomy. This operation will also delete all policy tags in this taxonomy along with
   * their associated policies.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName name = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   DeleteTaxonomyRequest request = DeleteTaxonomyRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   policyTagManagerClient.deleteTaxonomy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTaxonomy(DeleteTaxonomyRequest request) {
    deleteTaxonomyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a taxonomy. This operation will also delete all policy tags in this taxonomy along with
   * their associated policies.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName name = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   DeleteTaxonomyRequest request = DeleteTaxonomyRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = policyTagManagerClient.deleteTaxonomyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteTaxonomyRequest, Empty> deleteTaxonomyCallable() {
    return stub.deleteTaxonomyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   Taxonomy taxonomy = Taxonomy.newBuilder().build();
   *   Taxonomy response = policyTagManagerClient.updateTaxonomy(taxonomy);
   * }
   * </code></pre>
   *
   * @param taxonomy The taxonomy to update. Only description, display_name, and activated policy
   *     types can be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Taxonomy updateTaxonomy(Taxonomy taxonomy) {
    UpdateTaxonomyRequest request =
        UpdateTaxonomyRequest.newBuilder().setTaxonomy(taxonomy).build();
    return updateTaxonomy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   UpdateTaxonomyRequest request = UpdateTaxonomyRequest.newBuilder().build();
   *   Taxonomy response = policyTagManagerClient.updateTaxonomy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Taxonomy updateTaxonomy(UpdateTaxonomyRequest request) {
    return updateTaxonomyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   UpdateTaxonomyRequest request = UpdateTaxonomyRequest.newBuilder().build();
   *   ApiFuture&lt;Taxonomy&gt; future = policyTagManagerClient.updateTaxonomyCallable().futureCall(request);
   *   // Do something
   *   Taxonomy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateTaxonomyRequest, Taxonomy> updateTaxonomyCallable() {
    return stub.updateTaxonomyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all taxonomies in a project in a particular location that the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Taxonomy element : policyTagManagerClient.listTaxonomies(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the project to list the taxonomies of.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTaxonomiesPagedResponse listTaxonomies(LocationName parent) {
    ListTaxonomiesRequest request =
        ListTaxonomiesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listTaxonomies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all taxonomies in a project in a particular location that the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Taxonomy element : policyTagManagerClient.listTaxonomies(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the project to list the taxonomies of.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTaxonomiesPagedResponse listTaxonomies(String parent) {
    ListTaxonomiesRequest request = ListTaxonomiesRequest.newBuilder().setParent(parent).build();
    return listTaxonomies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all taxonomies in a project in a particular location that the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ListTaxonomiesRequest request = ListTaxonomiesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Taxonomy element : policyTagManagerClient.listTaxonomies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTaxonomiesPagedResponse listTaxonomies(ListTaxonomiesRequest request) {
    return listTaxonomiesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all taxonomies in a project in a particular location that the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ListTaxonomiesRequest request = ListTaxonomiesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListTaxonomiesPagedResponse&gt; future = policyTagManagerClient.listTaxonomiesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Taxonomy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListTaxonomiesRequest, ListTaxonomiesPagedResponse>
      listTaxonomiesPagedCallable() {
    return stub.listTaxonomiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all taxonomies in a project in a particular location that the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ListTaxonomiesRequest request = ListTaxonomiesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListTaxonomiesResponse response = policyTagManagerClient.listTaxonomiesCallable().call(request);
   *     for (Taxonomy element : response.getTaxonomiesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListTaxonomiesRequest, ListTaxonomiesResponse>
      listTaxonomiesCallable() {
    return stub.listTaxonomiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName name = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   Taxonomy response = policyTagManagerClient.getTaxonomy(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the requested taxonomy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Taxonomy getTaxonomy(TaxonomyName name) {
    GetTaxonomyRequest request =
        GetTaxonomyRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getTaxonomy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName name = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   Taxonomy response = policyTagManagerClient.getTaxonomy(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the requested taxonomy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Taxonomy getTaxonomy(String name) {
    GetTaxonomyRequest request = GetTaxonomyRequest.newBuilder().setName(name).build();
    return getTaxonomy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName name = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   GetTaxonomyRequest request = GetTaxonomyRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   Taxonomy response = policyTagManagerClient.getTaxonomy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Taxonomy getTaxonomy(GetTaxonomyRequest request) {
    return getTaxonomyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName name = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   GetTaxonomyRequest request = GetTaxonomyRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Taxonomy&gt; future = policyTagManagerClient.getTaxonomyCallable().futureCall(request);
   *   // Do something
   *   Taxonomy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetTaxonomyRequest, Taxonomy> getTaxonomyCallable() {
    return stub.getTaxonomyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a policy tag in the specified taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName parent = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   PolicyTag policyTag = PolicyTag.newBuilder().build();
   *   PolicyTag response = policyTagManagerClient.createPolicyTag(parent, policyTag);
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the taxonomy that the policy tag will belong to.
   * @param policyTag The policy tag to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PolicyTag createPolicyTag(TaxonomyName parent, PolicyTag policyTag) {
    CreatePolicyTagRequest request =
        CreatePolicyTagRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setPolicyTag(policyTag)
            .build();
    return createPolicyTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a policy tag in the specified taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName parent = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   PolicyTag policyTag = PolicyTag.newBuilder().build();
   *   PolicyTag response = policyTagManagerClient.createPolicyTag(parent.toString(), policyTag);
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the taxonomy that the policy tag will belong to.
   * @param policyTag The policy tag to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PolicyTag createPolicyTag(String parent, PolicyTag policyTag) {
    CreatePolicyTagRequest request =
        CreatePolicyTagRequest.newBuilder().setParent(parent).setPolicyTag(policyTag).build();
    return createPolicyTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a policy tag in the specified taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName parent = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   CreatePolicyTagRequest request = CreatePolicyTagRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   PolicyTag response = policyTagManagerClient.createPolicyTag(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PolicyTag createPolicyTag(CreatePolicyTagRequest request) {
    return createPolicyTagCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a policy tag in the specified taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName parent = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   CreatePolicyTagRequest request = CreatePolicyTagRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;PolicyTag&gt; future = policyTagManagerClient.createPolicyTagCallable().futureCall(request);
   *   // Do something
   *   PolicyTag response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreatePolicyTagRequest, PolicyTag> createPolicyTagCallable() {
    return stub.createPolicyTagCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a policy tag. Also deletes all of its descendant policy tags.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   PolicyTagName name = PolicyTagName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]", "[POLICY_TAG]");
   *   policyTagManagerClient.deletePolicyTag(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the policy tag to be deleted. All of its descendant
   *     policy tags will also be deleted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deletePolicyTag(PolicyTagName name) {
    DeletePolicyTagRequest request =
        DeletePolicyTagRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deletePolicyTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a policy tag. Also deletes all of its descendant policy tags.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   PolicyTagName name = PolicyTagName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]", "[POLICY_TAG]");
   *   policyTagManagerClient.deletePolicyTag(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the policy tag to be deleted. All of its descendant
   *     policy tags will also be deleted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deletePolicyTag(String name) {
    DeletePolicyTagRequest request = DeletePolicyTagRequest.newBuilder().setName(name).build();
    deletePolicyTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a policy tag. Also deletes all of its descendant policy tags.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   PolicyTagName name = PolicyTagName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]", "[POLICY_TAG]");
   *   DeletePolicyTagRequest request = DeletePolicyTagRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   policyTagManagerClient.deletePolicyTag(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deletePolicyTag(DeletePolicyTagRequest request) {
    deletePolicyTagCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a policy tag. Also deletes all of its descendant policy tags.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   PolicyTagName name = PolicyTagName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]", "[POLICY_TAG]");
   *   DeletePolicyTagRequest request = DeletePolicyTagRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = policyTagManagerClient.deletePolicyTagCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeletePolicyTagRequest, Empty> deletePolicyTagCallable() {
    return stub.deletePolicyTagCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   PolicyTag policyTag = PolicyTag.newBuilder().build();
   *   PolicyTag response = policyTagManagerClient.updatePolicyTag(policyTag);
   * }
   * </code></pre>
   *
   * @param policyTag The policy tag to update. Only the description, display_name, and
   *     parent_policy_tag fields can be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PolicyTag updatePolicyTag(PolicyTag policyTag) {
    UpdatePolicyTagRequest request =
        UpdatePolicyTagRequest.newBuilder().setPolicyTag(policyTag).build();
    return updatePolicyTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   UpdatePolicyTagRequest request = UpdatePolicyTagRequest.newBuilder().build();
   *   PolicyTag response = policyTagManagerClient.updatePolicyTag(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PolicyTag updatePolicyTag(UpdatePolicyTagRequest request) {
    return updatePolicyTagCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   UpdatePolicyTagRequest request = UpdatePolicyTagRequest.newBuilder().build();
   *   ApiFuture&lt;PolicyTag&gt; future = policyTagManagerClient.updatePolicyTagCallable().futureCall(request);
   *   // Do something
   *   PolicyTag response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdatePolicyTagRequest, PolicyTag> updatePolicyTagCallable() {
    return stub.updatePolicyTagCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all policy tags in a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName parent = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   for (PolicyTag element : policyTagManagerClient.listPolicyTags(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the taxonomy to list the policy tags of.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPolicyTagsPagedResponse listPolicyTags(TaxonomyName parent) {
    ListPolicyTagsRequest request =
        ListPolicyTagsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listPolicyTags(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all policy tags in a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName parent = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   for (PolicyTag element : policyTagManagerClient.listPolicyTags(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the taxonomy to list the policy tags of.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPolicyTagsPagedResponse listPolicyTags(String parent) {
    ListPolicyTagsRequest request = ListPolicyTagsRequest.newBuilder().setParent(parent).build();
    return listPolicyTags(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all policy tags in a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName parent = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   ListPolicyTagsRequest request = ListPolicyTagsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (PolicyTag element : policyTagManagerClient.listPolicyTags(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPolicyTagsPagedResponse listPolicyTags(ListPolicyTagsRequest request) {
    return listPolicyTagsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all policy tags in a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName parent = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   ListPolicyTagsRequest request = ListPolicyTagsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListPolicyTagsPagedResponse&gt; future = policyTagManagerClient.listPolicyTagsPagedCallable().futureCall(request);
   *   // Do something
   *   for (PolicyTag element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListPolicyTagsRequest, ListPolicyTagsPagedResponse>
      listPolicyTagsPagedCallable() {
    return stub.listPolicyTagsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all policy tags in a taxonomy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   TaxonomyName parent = TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]");
   *   ListPolicyTagsRequest request = ListPolicyTagsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListPolicyTagsResponse response = policyTagManagerClient.listPolicyTagsCallable().call(request);
   *     for (PolicyTag element : response.getPolicyTagsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListPolicyTagsRequest, ListPolicyTagsResponse>
      listPolicyTagsCallable() {
    return stub.listPolicyTagsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   PolicyTagName name = PolicyTagName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]", "[POLICY_TAG]");
   *   PolicyTag response = policyTagManagerClient.getPolicyTag(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the requested policy tag.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PolicyTag getPolicyTag(PolicyTagName name) {
    GetPolicyTagRequest request =
        GetPolicyTagRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getPolicyTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   PolicyTagName name = PolicyTagName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]", "[POLICY_TAG]");
   *   PolicyTag response = policyTagManagerClient.getPolicyTag(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the requested policy tag.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PolicyTag getPolicyTag(String name) {
    GetPolicyTagRequest request = GetPolicyTagRequest.newBuilder().setName(name).build();
    return getPolicyTag(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   PolicyTagName name = PolicyTagName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]", "[POLICY_TAG]");
   *   GetPolicyTagRequest request = GetPolicyTagRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   PolicyTag response = policyTagManagerClient.getPolicyTag(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PolicyTag getPolicyTag(GetPolicyTagRequest request) {
    return getPolicyTagCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   PolicyTagName name = PolicyTagName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]", "[POLICY_TAG]");
   *   GetPolicyTagRequest request = GetPolicyTagRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;PolicyTag&gt; future = policyTagManagerClient.getPolicyTagCallable().futureCall(request);
   *   // Do something
   *   PolicyTag response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetPolicyTagRequest, PolicyTag> getPolicyTagCallable() {
    return stub.getPolicyTagCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the IAM policy for a taxonomy or a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   ResourceName resource = EntryName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]", "[ENTRY]");
   *   GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .build();
   *   Policy response = policyTagManagerClient.getIamPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the IAM policy for a taxonomy or a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   ResourceName resource = EntryName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]", "[ENTRY]");
   *   GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = policyTagManagerClient.getIamPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the IAM policy for a taxonomy or a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   ResourceName resource = EntryName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]", "[ENTRY]");
   *   Policy policy = Policy.newBuilder().build();
   *   SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .setPolicy(policy)
   *     .build();
   *   Policy response = policyTagManagerClient.setIamPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the IAM policy for a taxonomy or a policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   ResourceName resource = EntryName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]", "[ENTRY]");
   *   Policy policy = Policy.newBuilder().build();
   *   SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .setPolicy(policy)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = policyTagManagerClient.setIamPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the permissions that a caller has on the specified taxonomy or policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   ResourceName resource = EntryName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]", "[ENTRY]");
   *   List&lt;String&gt; permissions = new ArrayList&lt;&gt;();
   *   TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .addAllPermissions(permissions)
   *     .build();
   *   TestIamPermissionsResponse response = policyTagManagerClient.testIamPermissions(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the permissions that a caller has on the specified taxonomy or policy tag.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
   *   ResourceName resource = EntryName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]", "[ENTRY]");
   *   List&lt;String&gt; permissions = new ArrayList&lt;&gt;();
   *   TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
   *     .setResource(resource.toString())
   *     .addAllPermissions(permissions)
   *     .build();
   *   ApiFuture&lt;TestIamPermissionsResponse&gt; future = policyTagManagerClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something
   *   TestIamPermissionsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListTaxonomiesPagedResponse
      extends AbstractPagedListResponse<
          ListTaxonomiesRequest,
          ListTaxonomiesResponse,
          Taxonomy,
          ListTaxonomiesPage,
          ListTaxonomiesFixedSizeCollection> {

    public static ApiFuture<ListTaxonomiesPagedResponse> createAsync(
        PageContext<ListTaxonomiesRequest, ListTaxonomiesResponse, Taxonomy> context,
        ApiFuture<ListTaxonomiesResponse> futureResponse) {
      ApiFuture<ListTaxonomiesPage> futurePage =
          ListTaxonomiesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTaxonomiesPage, ListTaxonomiesPagedResponse>() {
            @Override
            public ListTaxonomiesPagedResponse apply(ListTaxonomiesPage input) {
              return new ListTaxonomiesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListTaxonomiesPagedResponse(ListTaxonomiesPage page) {
      super(page, ListTaxonomiesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTaxonomiesPage
      extends AbstractPage<
          ListTaxonomiesRequest, ListTaxonomiesResponse, Taxonomy, ListTaxonomiesPage> {

    private ListTaxonomiesPage(
        PageContext<ListTaxonomiesRequest, ListTaxonomiesResponse, Taxonomy> context,
        ListTaxonomiesResponse response) {
      super(context, response);
    }

    private static ListTaxonomiesPage createEmptyPage() {
      return new ListTaxonomiesPage(null, null);
    }

    @Override
    protected ListTaxonomiesPage createPage(
        PageContext<ListTaxonomiesRequest, ListTaxonomiesResponse, Taxonomy> context,
        ListTaxonomiesResponse response) {
      return new ListTaxonomiesPage(context, response);
    }

    @Override
    public ApiFuture<ListTaxonomiesPage> createPageAsync(
        PageContext<ListTaxonomiesRequest, ListTaxonomiesResponse, Taxonomy> context,
        ApiFuture<ListTaxonomiesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTaxonomiesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTaxonomiesRequest,
          ListTaxonomiesResponse,
          Taxonomy,
          ListTaxonomiesPage,
          ListTaxonomiesFixedSizeCollection> {

    private ListTaxonomiesFixedSizeCollection(List<ListTaxonomiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTaxonomiesFixedSizeCollection createEmptyCollection() {
      return new ListTaxonomiesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTaxonomiesFixedSizeCollection createCollection(
        List<ListTaxonomiesPage> pages, int collectionSize) {
      return new ListTaxonomiesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListPolicyTagsPagedResponse
      extends AbstractPagedListResponse<
          ListPolicyTagsRequest,
          ListPolicyTagsResponse,
          PolicyTag,
          ListPolicyTagsPage,
          ListPolicyTagsFixedSizeCollection> {

    public static ApiFuture<ListPolicyTagsPagedResponse> createAsync(
        PageContext<ListPolicyTagsRequest, ListPolicyTagsResponse, PolicyTag> context,
        ApiFuture<ListPolicyTagsResponse> futureResponse) {
      ApiFuture<ListPolicyTagsPage> futurePage =
          ListPolicyTagsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListPolicyTagsPage, ListPolicyTagsPagedResponse>() {
            @Override
            public ListPolicyTagsPagedResponse apply(ListPolicyTagsPage input) {
              return new ListPolicyTagsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListPolicyTagsPagedResponse(ListPolicyTagsPage page) {
      super(page, ListPolicyTagsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPolicyTagsPage
      extends AbstractPage<
          ListPolicyTagsRequest, ListPolicyTagsResponse, PolicyTag, ListPolicyTagsPage> {

    private ListPolicyTagsPage(
        PageContext<ListPolicyTagsRequest, ListPolicyTagsResponse, PolicyTag> context,
        ListPolicyTagsResponse response) {
      super(context, response);
    }

    private static ListPolicyTagsPage createEmptyPage() {
      return new ListPolicyTagsPage(null, null);
    }

    @Override
    protected ListPolicyTagsPage createPage(
        PageContext<ListPolicyTagsRequest, ListPolicyTagsResponse, PolicyTag> context,
        ListPolicyTagsResponse response) {
      return new ListPolicyTagsPage(context, response);
    }

    @Override
    public ApiFuture<ListPolicyTagsPage> createPageAsync(
        PageContext<ListPolicyTagsRequest, ListPolicyTagsResponse, PolicyTag> context,
        ApiFuture<ListPolicyTagsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListPolicyTagsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListPolicyTagsRequest,
          ListPolicyTagsResponse,
          PolicyTag,
          ListPolicyTagsPage,
          ListPolicyTagsFixedSizeCollection> {

    private ListPolicyTagsFixedSizeCollection(List<ListPolicyTagsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListPolicyTagsFixedSizeCollection createEmptyCollection() {
      return new ListPolicyTagsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListPolicyTagsFixedSizeCollection createCollection(
        List<ListPolicyTagsPage> pages, int collectionSize) {
      return new ListPolicyTagsFixedSizeCollection(pages, collectionSize);
    }
  }
}
