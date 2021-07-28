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
// source: google/cloud/datacatalog/v1/usage.proto

package com.google.cloud.datacatalog.v1;

public interface UsageSignalOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.UsageSignal)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The end timestamp of the duration of usage statistics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The end timestamp of the duration of usage statistics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The end timestamp of the duration of usage statistics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Usage statistics over each of the predefined time ranges.
   * Supported time ranges are `{"24H", "7D", "30D"}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2;
   * </code>
   */
  int getUsageWithinTimeRangeCount();
  /**
   *
   *
   * <pre>
   * Usage statistics over each of the predefined time ranges.
   * Supported time ranges are `{"24H", "7D", "30D"}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2;
   * </code>
   */
  boolean containsUsageWithinTimeRange(java.lang.String key);
  /** Use {@link #getUsageWithinTimeRangeMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
      getUsageWithinTimeRange();
  /**
   *
   *
   * <pre>
   * Usage statistics over each of the predefined time ranges.
   * Supported time ranges are `{"24H", "7D", "30D"}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
      getUsageWithinTimeRangeMap();
  /**
   *
   *
   * <pre>
   * Usage statistics over each of the predefined time ranges.
   * Supported time ranges are `{"24H", "7D", "30D"}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2;
   * </code>
   */
  com.google.cloud.datacatalog.v1.UsageStats getUsageWithinTimeRangeOrDefault(
      java.lang.String key, com.google.cloud.datacatalog.v1.UsageStats defaultValue);
  /**
   *
   *
   * <pre>
   * Usage statistics over each of the predefined time ranges.
   * Supported time ranges are `{"24H", "7D", "30D"}`.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2;
   * </code>
   */
  com.google.cloud.datacatalog.v1.UsageStats getUsageWithinTimeRangeOrThrow(java.lang.String key);
}
