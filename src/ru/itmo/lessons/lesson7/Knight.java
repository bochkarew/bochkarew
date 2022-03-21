package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.AttackAble;
import ru.itmo.lessons.lesson7.base.BattleUnit;

// Рыцарь
// здоровье
// очкиАтаки ++
// дополнительноеЗдоровье

//final перед class запрещает наследников. Рыцарь наследуется о БаттлЮнит, но никто не может наследоваться от Рыцаря
// класс Knight реализует (имплементирует) интерфейсы AttackAble1, AttackAble2, AttackAble3

public final class Knight extends BattleUnit implements AttackAble {
    private final int additionalHealth = 10;
    public Knight(int healthScore, int attackScore){
        super(healthScore, attackScore);
    }

    public void knightVoid(){
        System.out.println("Метод knightVoid");
    }

    @Override
    public void rest() {
        plusHealth(3);
        System.out.println("Отдых рыцаря: здоровье: "+healthScore);
    }

    @Override
    public void attack(BattleUnit enemy){
        if(enemy.isAlive() && this.isAlive())enemy.minusHealth(attackScore);
        if(enemy.isAlive()) this.minusHealth(enemy.getAttackScore());
        if(enemy.isAlive()) this.plusHealth((int) (Math.random()* additionalHealth));
    }


}
