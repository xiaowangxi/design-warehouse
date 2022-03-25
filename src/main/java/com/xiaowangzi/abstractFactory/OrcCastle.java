package com.xiaowangzi.abstractFactory;

public class OrcCastle implements Castle {

    public static final String DESCRIPTION = "This is the orc castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
