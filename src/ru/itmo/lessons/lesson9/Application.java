package ru.itmo.lessons.lesson9;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Point a = new Point(23,-12);
        Point b = new Point(23,-12);
        Point c = new Point(12,33);
        Point d = new Point(45,11);
        Point e = new Point(33,31);
        Point f = new Point(12,36);

        System.out.println(a);
        System.out.println(b);

        // сравнение ссылок
        System.out.println(a == b); // вернется false

        // по  умолчанию метод equals сравнивает ссылки
        // и должен быть переопределен в классе
        System.out.println(a.equals(b));


        // клонирование (метод clone())
        // у метода clone модификатор protected, тоесть его нельзя вызвать просто так, его надо переопределить


        Point aClone = a.clone();
        System.out.println(a == aClone); // false
        System.out.println(a.equals(aClone)); // true

        Figure figure = new Figure(3);
        figure.addPoint(a);
        figure.addPoint(b);
        figure.addPoint(c);
        figure.addPoint(d);
        figure.addPoint(e);
        figure.addPoint(f);

        System.out.println(figure);
        Figure figureClone = figure.clone();
        System.out.println(figure.equals(figureClone)); // true
        System.out.println(figure.getPoints() == figureClone.getPoints()); //false
        System.out.println(Arrays.equals(figure.getPoints(), figureClone.getPoints())); //true
        System.out.println(figure.getPoints()[0] == figureClone.getPoints()[0]); // false
        System.out.println(figure.getPoints()[0].equals(figureClone.getPoints()[0])); // true

    }
}
