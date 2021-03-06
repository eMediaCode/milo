/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.client.model.types.variables;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.core.model.BasicProperty;
import org.eclipse.milo.opcua.sdk.core.model.Property;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;


public interface TwoStateDiscreteType extends DiscreteItemType {

    Property<LocalizedText> FALSE_STATE = new BasicProperty<>(
        QualifiedName.parse("0:FalseState"),
        NodeId.parse("ns=0;i=21"),
        -1,
        LocalizedText.class
    );

    Property<LocalizedText> TRUE_STATE = new BasicProperty<>(
        QualifiedName.parse("0:TrueState"),
        NodeId.parse("ns=0;i=21"),
        -1,
        LocalizedText.class
    );


    CompletableFuture<? extends PropertyType> falseState();

    CompletableFuture<LocalizedText> getFalseState();

    CompletableFuture<StatusCode> setFalseState(LocalizedText value);

    CompletableFuture<? extends PropertyType> trueState();

    CompletableFuture<LocalizedText> getTrueState();

    CompletableFuture<StatusCode> setTrueState(LocalizedText value);


}