package ru.itmo.lessons.lesson11;

public class Utill {
    // Общие данные, которые нужны для работы приложения
    public static int max;
    public static int min;
    public static final double PI;
    // статический блок для инициализации статических свойств (переменных)
    // инструкции выполняются один раз при загрузке класса
    static {
        PI = 3.14;
    }
    private Utill(){} // сделали приватный метод чтобы нельзя было создавать объекты класса
                      // а только обращаться к его переменым

    public static int random(int min, int max){
        // из статических методов нельзя обратиться к  не statio свойствам и методам
        // нельзя обратиться к this
        return (int) (min + Math.random() * (max - min));
    }
}
