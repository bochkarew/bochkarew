package ru.itmo.lessons.lesson13.types;

import java.lang.reflect.Parameter;

public class TypesApp {
    public static void main(String[] args) {
        User<String> stringUser = new User<>();
        stringUser.setId("frdas");
        stringUser.setLogin("wqeqwe");

        String sId = (String) stringUser.getId();
        System.out.println(sId.contains("fr"));

        User<Integer> integerUser = new User<>();
        integerUser.setLogin("asd");
        integerUser.setId(1);
        Integer iId = integerUser.getId();
        System.out.println(iId > 0);


// =========================================== ЭТО ВАЖНО
        PairContainer<String, Integer> container1 = new PairContainer<>("qwe",3);
        System.out.println(container1.getKey()); // String
        System.out.println(container1.getValue()); // Integer

        PairContainer<String, User> container2 = new PairContainer<>("asd", stringUser);
        Object oId = container2.getValue().getId();

        PairContainer<String, User<String>> container3 = new PairContainer<>("zxc", stringUser);
        Object strId = container3.getValue().getId();
// ===========================================

        // внутри <...> - только типы данных, НЕ значения

        PairContainer<Integer, User<Integer>> container4 = new PairContainer<>(2, integerUser);
        PairContainer<Integer,PairContainer<Integer, User<Integer>>> container5 = new PairContainer<>(3, container4);


    }
}