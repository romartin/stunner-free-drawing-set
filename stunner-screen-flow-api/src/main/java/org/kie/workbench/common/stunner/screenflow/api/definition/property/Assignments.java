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

package org.kie.workbench.common.stunner.screenflow.api.definition.property;

import java.util.function.Supplier;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;

@Portable
@Bindable
public class Assignments {

    public static class DefaultNameProvider implements Supplier<String> {

        @Override
        public String get() {
            return "-- no name --";
        }
    }

    private String subjects;

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(final String subjects) {
        this.subjects = subjects;
    }
}
