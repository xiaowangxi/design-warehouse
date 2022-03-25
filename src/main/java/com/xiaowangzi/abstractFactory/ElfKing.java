package com.xiaowangzi.abstractFactory;

public class ElfKing implements King {
    public static final String DESCRIPTION = "This is the elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
