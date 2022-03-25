package com.xiaowangzi.abstractfactory;

import com.xiaowangzi.abstractFactory.App;
import com.xiaowangzi.abstractFactory.Army;
import com.xiaowangzi.abstractFactory.Castle;
import com.xiaowangzi.abstractFactory.ElfArmy;
import com.xiaowangzi.abstractFactory.ElfCastle;
import com.xiaowangzi.abstractFactory.ElfKing;
import com.xiaowangzi.abstractFactory.King;
import com.xiaowangzi.abstractFactory.Kingdom;
import com.xiaowangzi.abstractFactory.OrcArmy;
import com.xiaowangzi.abstractFactory.OrcCastle;
import com.xiaowangzi.abstractFactory.OrcKing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFactoryTest {
    private final App app = new App();

    @Test
    void verifyKingCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        final Kingdom kingdom = app.getKingdom();

        final King elfKing = kingdom.getKing();
        assertTrue(elfKing instanceof ElfKing);
        assertEquals(ElfKing.DESCRIPTION, elfKing.getDescription());

        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        final King orcKing = kingdom.getKing();
        assertTrue(orcKing instanceof OrcKing);
        assertEquals(OrcKing.DESCRIPTION, orcKing.getDescription());
    }

    @Test
    void verifyCastleCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        final Kingdom kingdom = app.getKingdom();

        final Castle elfCastle = kingdom.getCastle();
        assertTrue(elfCastle instanceof ElfCastle);
        assertEquals(ElfCastle.DESCRIPTION, elfCastle.getDescription());

        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        final Castle orcCastle = kingdom.getCastle();
        assertTrue(orcCastle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
    }

    @Test
    void verifyArmyCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        final Kingdom kingdom = app.getKingdom();

        final Army elfArmy = kingdom.getArmy();
        assertTrue(elfArmy instanceof ElfArmy);
        assertEquals(ElfArmy.DESCRIPTION, elfArmy.getDescription());

        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        final Army orcArmy = kingdom.getArmy();
        assertTrue(orcArmy instanceof OrcArmy);
        assertEquals(OrcArmy.DESCRIPTION, orcArmy.getDescription());
    }

    @Test
    void verifyElfKingdomCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        final Kingdom kingdom = app.getKingdom();

        final King king = kingdom.getKing();
        final Castle castle = kingdom.getCastle();
        final Army army = kingdom.getArmy();
        assertTrue(king instanceof ElfKing);
        assertEquals(ElfKing.DESCRIPTION, king.getDescription());
        assertTrue(castle instanceof ElfCastle);
        assertEquals(ElfCastle.DESCRIPTION, castle.getDescription());
        assertTrue(army instanceof ElfArmy);
        assertEquals(ElfArmy.DESCRIPTION, army.getDescription());
    }

    @Test
    void verifyOrcKingdomCreation() {
        app.createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        final Kingdom kingdom = app.getKingdom();

        final King king = kingdom.getKing();
        final Castle castle = kingdom.getCastle();
        final Army army = kingdom.getArmy();
        assertTrue(king instanceof OrcKing);
        assertEquals(OrcKing.DESCRIPTION, king.getDescription());
        assertTrue(castle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
        assertTrue(army instanceof OrcArmy);
        assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
    }
}
