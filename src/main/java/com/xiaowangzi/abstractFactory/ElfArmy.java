package com.xiaowangzi.abstractFactory;

public class ElfArmy implements Army {
    static final String DESCRIPTION = "This is the elven army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
