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
package com.google.cloud.datacatalog.v1beta1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.datacatalog.v1beta1.ExportTaxonomiesRequest;
import com.google.cloud.datacatalog.v1beta1.ExportTaxonomiesResponse;
import com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesRequest;
import com.google.cloud.datacatalog.v1beta1.ImportTaxonomiesResponse;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Cloud Data Catalog API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class PolicyTagManagerSerializationStub implements BackgroundResource {

  public UnaryCallable<ImportTaxonomiesRequest, ImportTaxonomiesResponse>
      importTaxonomiesCallable() {
    throw new UnsupportedOperationException("Not implemented: importTaxonomiesCallable()");
  }

  public UnaryCallable<ExportTaxonomiesRequest, ExportTaxonomiesResponse>
      exportTaxonomiesCallable() {
    throw new UnsupportedOperationException("Not implemented: exportTaxonomiesCallable()");
  }

  @Override
  public abstract void close();
}
