package com.xiaowangzi.abstractFactory;

public class ElfArmy implements Army {
    public static final String DESCRIPTION = "This is the elven army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
