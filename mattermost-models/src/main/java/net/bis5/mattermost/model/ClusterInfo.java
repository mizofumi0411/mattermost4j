/*
 * Copyright (c) 2016-present, Takayuki Maruyama
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

package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Cluster info.
 * 
 * @author Takayuki Maruyama
 */
@Data
public class ClusterInfo {
  @JsonProperty("id")
  private String id;
  @JsonProperty("version")
  private String version;
  @JsonProperty("config_hash")
  private String configHash;
  @JsonProperty("internode_url")
  private String interNodeUrl;
  @JsonProperty("hostname")
  private String hostname;
  @JsonProperty("last_ping")
  private long lastPing;
  @JsonProperty("is_alive")
  private boolean isAlive;

}
