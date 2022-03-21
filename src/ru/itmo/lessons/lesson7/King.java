package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.AttackAble;
import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.base.Unit;

public final class King extends Unit {
    private int gold = 500;
    private BattleUnit[] army;

    public King(int healthScore){
        super(healthScore);
    }

    // увеличивает золото на count, нет ограничений по максимуму
    public void plusGold(int count){
        gold += count;
    }

    // уменьшает золото на count
    public void minusGold(int count) {
        if (gold < count) return; // если золота у короля меньше count, уменьшения не происходит
        gold -= count;
    }

    public void generateArmy(){
       if (gold < 250) {
           System.out.println("стоимость армии 250.  У корроля:" + gold);
           return;
       }
       gold -= 250;
       army = new BattleUnit[20];
       for (int i=0; i < army.length; i++){
           army[i] = BattleUnit.getBattleUnit();
       }
    }

    // заменяет погибших юнитов новыми рыцарями
    public void changeUnits(){
        if (gold < 20) { // заменять можно, пока у короля хватает золота
            System.out.println("Недостаточно золота для создании юнита");
            return;
        }
        for (int i = 0; i < army.length; i++) {
            if (gold < 20) { // заменять можно, пока у короля хватает золота
                System.out.println("Недостаточно золота для создании юнита");
                return;
            }
            minusGold(20); // стоимость одной замены - 20 золота
            if (army[i] != null && !army[i].isAlive()) {
                int healthScore = (int) (10 + Math.random() * 40);
                int attackScore = (int) (7 + Math.random() * 13);
                army[i] = new Knight(healthScore, attackScore);
            }
        }
    }

    // возвращает количество живых юнитов в армии
    public int getBattleUnitsCount() {
        int count = 0;
        for (BattleUnit battleUnit : army) {
            if (battleUnit.isAlive()) count += 1;
        }
        return count;
    }
    // реализация абстрактного метода
    @Override
    public void rest(){
        minusGold(50);
        plusHealth(5);
        System.out.println("Отдых короля: здоровье: "+healthScore+", золото: "+gold);
    }
}

