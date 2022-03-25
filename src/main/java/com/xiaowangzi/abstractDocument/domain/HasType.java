package com.xiaowangzi.abstractDocument.domain;

import com.xiaowangzi.abstractDocument.Document;
import com.xiaowangzi.abstractDocument.domain.enums.Property;

import java.util.Optional;

public interface HasType extends Document {
    default Optional<String> getType() {
        return Optional.ofNullable((String) get(Property.TYPE.toString()));
    }
}
