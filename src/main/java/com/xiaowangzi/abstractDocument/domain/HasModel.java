package com.xiaowangzi.abstractDocument.domain;

import com.xiaowangzi.abstractDocument.Document;
import com.xiaowangzi.abstractDocument.domain.enums.Property;

import java.util.Optional;

public interface HasModel extends Document {

    default Optional<String>getModel(){
        return  Optional.ofNullable((String)get(Property.MODEL.toString()));
    }

}
