package ru.itmo.lessons.lesson11.enums;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) {
        Article article1 = new Article("Путешествие по Австралии");
        article1.setCountry(Country.AUSTRALIA);
        System.out.println(article1.getCountry());

        Article article2 = new Article("Путешествие по UK");
        article2.setCountry(Country.UK);
        System.out.println(article2.getCountry());

        // методы перечислений, у всех перечислеий есть одиаковый набор методов
        // получение массива констант
        Country[] countries = Country.values();
        System.out.println(Arrays.toString(countries));
        // порядок будет таким же, в каком порядке они записаны в перечислении
        // и всегда будет таким, местами НЕ помеяются
        // индекс элемента перечисления
        System.out.println(Country.FRANCE.ordinal()); // выясяем номер индекса элемента в массиве

        for (Country country : countries){
            System.out.println("country " + country.name());
        }
        Country country = Country.valueOf("UK"); // возвращает ссылку на элемент перечисления
        System.out.println(country); // вызов метода toString



        Priority low = Priority.LOW;
        System.out.println(low.getCode());

      low.setCode(2);
       System.out.println(low.getCode());

       Priority[] priorities = Priority.values();

       for (Priority value : Priority.values()){
           System.out.println(value.getCode());
       }

       int sumRes = Operations.SUM.action(2,3);
        System.out.println(sumRes);

        int miltiRes = Operations.MULTI.action(2,3);
        System.out.println(miltiRes);


        Planets planet1 = Planets.EARTH;
        planet1.setRadius(200);
        planet1.setWeight(250);

        Planets planet2 = Planets.JUPITER;
        planet2.setRadius(2300);
        planet2.setWeight(350);

        Planets planet3 = Planets.PLUTON;
        planet3.setRadius(400);
        planet3.setWeight(450);

        Planets[] planets = Planets.values();
        for (Planets planet : planets) {
            System.out.println(planet.getName());
            System.out.println(planet.getRadius());
            System.out.println(planet.getWeight());
        }



    }
}
