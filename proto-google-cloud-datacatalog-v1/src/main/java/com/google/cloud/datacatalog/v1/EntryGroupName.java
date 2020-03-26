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

package com.google.cloud.datacatalog.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class EntryGroupName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/entryGroups/{entry_group}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String location;
  private final String entryGroup;

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getEntryGroup() {
    return entryGroup;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private EntryGroupName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    entryGroup = Preconditions.checkNotNull(builder.getEntryGroup());
  }

  public static EntryGroupName of(String project, String location, String entryGroup) {
    return newBuilder().setProject(project).setLocation(location).setEntryGroup(entryGroup).build();
  }

  public static String format(String project, String location, String entryGroup) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setEntryGroup(entryGroup)
        .build()
        .toString();
  }

  public static EntryGroupName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "EntryGroupName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("location"), matchMap.get("entry_group"));
  }

  public static List<EntryGroupName> parseList(List<String> formattedStrings) {
    List<EntryGroupName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<EntryGroupName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (EntryGroupName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("location", location);
          fieldMapBuilder.put("entryGroup", entryGroup);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project, "location", location, "entry_group", entryGroup);
  }

  /** Builder for EntryGroupName. */
  public static class Builder {

    private String project;
    private String location;
    private String entryGroup;

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getEntryGroup() {
      return entryGroup;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setEntryGroup(String entryGroup) {
      this.entryGroup = entryGroup;
      return this;
    }

    private Builder() {}

    private Builder(EntryGroupName entryGroupName) {
      project = entryGroupName.project;
      location = entryGroupName.location;
      entryGroup = entryGroupName.entryGroup;
    }

    public EntryGroupName build() {
      return new EntryGroupName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EntryGroupName) {
      EntryGroupName that = (EntryGroupName) o;
      return (this.project.equals(that.project))
          && (this.location.equals(that.location))
          && (this.entryGroup.equals(that.entryGroup));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= location.hashCode();
    h *= 1000003;
    h ^= entryGroup.hashCode();
    return h;
  }
}
