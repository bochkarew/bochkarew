package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.base.Unit;

import java.util.Scanner;

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

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите тип персонажа");
        String type = in.nextLine();

        Unit unit = null;
        if (type.equalsIgnoreCase("knight")){
            unit = new Knight(23, 56);
        } else if (type.equalsIgnoreCase("infantry")){
            unit = new Infantry(15, 28);
        } else unit = new King (11112);
        unit.rest();

        System.out.println(Math.max(1,7)); // max - статический static метод, находится в классе Math


    }
}
