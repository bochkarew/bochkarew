package ru.itmo.lessons.lesson13.methods;

public class CustomUtils {
    // типизированные методы (genertic methods)
    // метод который проверяет наличие элемента в массиве
    public static <T> boolean inArray(T[] arr, T element){
        if(arr == null || element == null){
            throw new IllegalArgumentException("null-ы передавать нельзя");
        }
        for (T t : arr) {
            if(element.equals(t)) return true;
        }
        return false;
    }
}
