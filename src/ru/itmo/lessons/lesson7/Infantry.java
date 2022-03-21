package ru.itmo.lessons.lesson7;
import ru.itmo.lessons.lesson7.base.BattleUnit;

public final class Infantry extends BattleUnit {
    private final int additionalAttack = 5;
    // FINAL свойство нельзя изменить
    // значение можно задать только при объявлении переменной или через конструктор
    // но не в сеттерах и тд

    public Infantry(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    public void infantryVoid(){
        System.out.println("Метод infantryVoid");
    }

// можно написать собственню реализацию, которая перепишет родительский метод.
// переопределение метода родителя
// если юнит выжил, у него attack уменшается на 3
// через SUPER. мы добавляем инструкции, а не переписываем
// если переопределяем, то пишем перед ним @Ovveride, эта штука проверяет корректность переопределения

@Override
public boolean runFromField(){
       if (super.runFromField()){
          attackScore -= 3;
           System.out.println("После бегства атака уменьшена на 3");
          return true;
       }
       return false;
    }
}


