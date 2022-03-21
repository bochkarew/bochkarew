package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;

// Рыцарь
// здоровье
// очкиАтаки ++
// дополнительноеЗдоровье

//final перед class запрещает наследников. Рыцарь наследуется о БаттлЮнит, но никто не может наследоваться от Рыцаря

public final class Knight extends BattleUnit {
    private final int additionalHealth = 10;
    public Knight(int healthScore, int attackScore){
        super(healthScore, attackScore);
    }

    public void knightVoid(){
        System.out.println("Метод knightVoid");
    }
}
