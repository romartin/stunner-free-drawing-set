/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.screenflow.api;

import javax.enterprise.context.ApplicationScoped;

import org.kie.workbench.common.stunner.core.definition.AbstractDefinitionSetResourceType;

@ApplicationScoped
public class ScreenFlowResourceType extends AbstractDefinitionSetResourceType {

    public static final String FILE_EXTENSION = "screenflow";

    @Override
    public String getShortName() {
        return "Screen Flow";
    }

    @Override
    public String getDescription() {
        return "Screen Flow";
    }

    @Override
    public String getSuffix() {
        return FILE_EXTENSION;
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public Class<?> getDefinitionSetType() {
        return ScreenFlowSet.class;
    }
}
