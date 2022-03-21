package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;

public class Infantry extends BattleUnit {
    private int additionalAttack = 5;

    public Infantry(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    public void infantryVoid(){
        System.out.println("Метод infantryVoid");
    }



// можно написать собственню реализацию, которая перепишет родительский метод.
// переопределение метода родителя
// если юнит выжил, у него attack уменшается на 3

public boolean runFromField(){
       if (super.runFromField()){
          attackScore -= 3;
           System.out.println("После бегства атака уменьшена на 3");
          return true;
       }
       return false;
    }
}


