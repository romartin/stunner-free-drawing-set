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

package org.kie.workbench.common.stunner.screenflow.api.definition;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;

@Portable
@Bindable
public class Assignment extends FlowBean {

    public static class AssignmentBuilder implements Supplier<Assignment> {

        @Override
        public Assignment get() {
            return new Assignment("User activity");
        }
    }

    private final Set<String> assignments = new HashSet<>();

    private String color;

    public Assignment() {
        this("Assignment");
    }

    public Assignment(final @MapsTo("name") String name) {
        super(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public Set<String> getAssignments() {
        return assignments;
    }
}
