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

package org.kie.workbench.common.stunner.freedraw.backend;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.kie.workbench.common.stunner.backend.service.AbstractDefinitionSetService;
import org.kie.workbench.common.stunner.backend.service.ErraiDiagramMarshaller;
import org.kie.workbench.common.stunner.core.definition.DefinitionSetResourceType;
import org.kie.workbench.common.stunner.freedraw.api.FreeDrawingResourceType;

@ApplicationScoped
public class FreeDrawingBackendService extends AbstractDefinitionSetService {

    private ErraiDiagramMarshaller erraiDiagramMarshaller;
    private FreeDrawingResourceType resourceType;

    protected FreeDrawingBackendService() {
        this(null,
             null);
    }

    @Inject
    public FreeDrawingBackendService(final ErraiDiagramMarshaller erraiDiagramMarshaller,
                                     final FreeDrawingResourceType resourceType) {
        super(erraiDiagramMarshaller);
        this.resourceType = resourceType;
    }

    @Override
    public DefinitionSetResourceType getResourceType() {
        return resourceType;
    }
}
