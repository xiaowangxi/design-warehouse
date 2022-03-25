package com.xiaowangzi.abstractFactory;

public class OrcArmy implements Army {
    public static final String DESCRIPTION = "This is the orc army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
