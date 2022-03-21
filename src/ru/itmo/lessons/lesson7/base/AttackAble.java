package ru.itmo.lessons.lesson7.base;
// экземпляры интерфейса создать нельзя
// интерфейсы создаются чтобы содержать методы без реализации, один или несколько
public interface AttackAble {
 // по умолчанию все методы в интерфейсе public, поэтому это можно не писать
    void attack(BattleUnit enemy);

// может быть метод С РЕАЛИЗАЦИЕЙ, но он должен быть определен как default
    default void someVoid(){
        System.out.println("метод с реализацией");
    }
}
