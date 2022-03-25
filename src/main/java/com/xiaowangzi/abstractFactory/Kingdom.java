package com.xiaowangzi.abstractFactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kingdom {
    private King king;
    private Castle castle;
    private Army army;

    public static class FactoryMaker{
        public enum KingdomType{
            ELF, ORC
        }

        /**
         * The factory method to create KingdomFactory concrete objects.
         */
        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }
}
