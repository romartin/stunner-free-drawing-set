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

package org.kie.workbench.common.stunner.freedraw.client.project;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.google.gwt.user.client.ui.IsWidget;
import org.kie.workbench.common.stunner.core.api.DefinitionManager;
import org.kie.workbench.common.stunner.freedraw.api.FreeDrawingSet;
import org.kie.workbench.common.stunner.project.client.handlers.AbstractProjectDiagramNewResourceHandler;
import org.kie.workbench.common.stunner.project.client.service.ClientProjectDiagramService;
import org.uberfire.ext.widgets.common.client.common.BusyIndicatorView;

@ApplicationScoped
public class FreeDrawingNewResourceHandler extends AbstractProjectDiagramNewResourceHandler<FreeDrawingClientResourceType> {

    protected FreeDrawingNewResourceHandler() {
        this(null,
             null,
             null,
             null);
    }

    @Inject
    public FreeDrawingNewResourceHandler(final DefinitionManager definitionManager,
                                         final ClientProjectDiagramService projectDiagramServices,
                                         final BusyIndicatorView indicatorView,
                                         final FreeDrawingClientResourceType projectDiagramResourceType) {
        super(definitionManager,
              projectDiagramServices,
              indicatorView,
              projectDiagramResourceType);
    }

    @Override
    protected Class<?> getDefinitionSetType() {
        return FreeDrawingSet.class;
    }

    @Override
    protected String getEditorIdentifier() {
        return FreeDrawingDiagramEditor.EDITOR_ID;
    }

    @Override
    public String getDescription() {
        return getFreeDrawingResourceType().getDescription();
    }

    @Override
    public IsWidget getIcon() {
        return getFreeDrawingResourceType().getIcon();
    }

    private FreeDrawingClientResourceType getFreeDrawingResourceType() {
        return (FreeDrawingClientResourceType) super.getResourceType();
    }
}
