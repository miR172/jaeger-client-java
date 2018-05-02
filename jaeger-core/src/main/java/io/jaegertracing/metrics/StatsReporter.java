/*
 * Copyright (c) 2016, Uber Technologies, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.jaegertracing.metrics;

import java.util.Map;

/**
 * @deprecated Use {@link MetricsFactory} instead
 */
@Deprecated
public interface StatsReporter {

  void incCounter(String name, long delta, Map<String, String> tags);

  void recordTimer(String name, long time, Map<String, String> tags);

  void updateGauge(String name, long amount, Map<String, String> tags);
}