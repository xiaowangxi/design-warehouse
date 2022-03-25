package com.xiaowangzi.abstractDocument.domain;

import com.xiaowangzi.abstractDocument.Document;
import com.xiaowangzi.abstractDocument.domain.enums.Property;

import java.util.stream.Stream;

public interface HasParts extends Document {
    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
