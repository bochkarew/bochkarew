package ru.itmo.lessons.lesson13.methods;

public class UtilsApp {
    public static void main(String[] args) {
        String[] strings = {"qwe", "asd", "sds" };
        String string = "qwe";
        System.out.println(CustomUtils.inArray(strings, string));
        System.out.println(CustomUtils.<String>inArray(strings, string));
        // если не конкретизируем тип даных, то можно запихнуть любой
        // а если ставим к примеру Строковый тип данных, а в аргументах укажем int цифру - программа ругнется
        // System.out.println(CustomUtils.<String>inArray(strings, 1));


        Integer[] integers = {2,4,6};
        Integer integer = 34;
        System.out.println(CustomUtils.<Integer>inArray(integers, integer));
        // объявление типа данных помогает исправить ошибку в момент ее появления, а не потом
        System.out.println(compareHashCode(12, "12"));
    }
    // при вызове T может быть Number и любым из его родителей
    // при вызове K может быть String и любым из его родителей
    public static <T extends  Number, K extends String>
    int compareHashCode(T first, K second){
        // first - методы Number и его родителей
        // second - методы String и его родителей
        return Integer.compare(first.hashCode(), second.hashCode());
        // если метод планирует принимать на вход или возвращать разные типы данных
    }


}
