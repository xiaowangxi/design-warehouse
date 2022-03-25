package com.xiaowangzi.abstractFactory;

public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
