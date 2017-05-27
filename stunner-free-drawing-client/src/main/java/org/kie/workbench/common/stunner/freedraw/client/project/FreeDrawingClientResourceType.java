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

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import org.kie.workbench.common.stunner.freedraw.api.FreeDrawingResourceType;
import org.kie.workbench.common.stunner.freedraw.client.resources.FreeDrawingImageResources;
import org.kie.workbench.common.stunner.project.client.type.AbstractStunnerClientResourceType;

@ApplicationScoped
public class FreeDrawingClientResourceType extends AbstractStunnerClientResourceType<FreeDrawingResourceType> {

    private static final Image ICON = new Image(FreeDrawingImageResources.INSTANCE.asset());

    protected FreeDrawingClientResourceType() {
        this(null);
    }

    @Inject
    public FreeDrawingClientResourceType(final FreeDrawingResourceType definitionSetResourceType) {
        super(definitionSetResourceType);
    }

    @Override
    public IsWidget getIcon() {
        return ICON;
    }
}