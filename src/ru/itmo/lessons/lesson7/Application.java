package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.base.Unit;
// public class King extends Unit
// public class Knight extends BattleUnit (ext Unit)
// public class Infantry extends BattleUnit (ext Unit)
public class Application {
    public static void main(String[] args) {
        Knight knight1 = new Knight(20, 17);
        knight1.knightVoid();
        knight1.runFromField();

        BattleUnit knight2 = new Knight(20, 17);
        knight2.battleUnitVoid();

        Unit knight3 = new Knight(20, 17);
        knight3.plusHealth(20);

        Infantry infantry1 = new Infantry(18, 15);
        infantry1.runFromField();

    }
}
