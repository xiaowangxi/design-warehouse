package com.xiaowangzi.abstractDocument.domain;

import com.xiaowangzi.abstractDocument.AbstractDocument;

import java.util.Map;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {
    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
