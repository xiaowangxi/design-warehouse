package com.xiaowangzi.abstractDocument.domain;

import com.xiaowangzi.abstractDocument.AbstractDocument;

import java.util.Map;

public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {
    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
