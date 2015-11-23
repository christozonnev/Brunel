/*
 * Copyright (c) 2015 IBM Corporation and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brunel.build.util;

/**
 * Options that can be set for a builder
 */
public class BuilderOptions {


    /**
     * none -  no data described
     * full - send full data set
     * columns - send only required columns
     * minimal - send the minimal data needed by the system
     */
    public enum DataMethod { none, full, columns, minimal}

    public String visIdentifier = "visualization";              // The HTML ID of the SVG element containign the vis
    public String dataName = "table%d";                         // Pattern for the data table ID. %d is the index.
    public String className = "BrunelVis";                      // Name of the base function
    public DataMethod includeData = DataMethod.columns;         // What level of data to include
    public boolean exposeHooks = true;                          // if true, expose hooks for Javascript to use
    public boolean generateBuildCode = true;                    // if true, Add javascript to build the chart initially
    public boolean readableJavascript = true;                   // Readable or shorter
    public String localResources;                               // If set, get resources from this local directory
    public String version = "0.9";                              // Which online version to use

}
