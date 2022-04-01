package ru.itmo.lessons.lesson12;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.sql.SQLOutput;

public class ExceptionLesson {
    public static void main(String[] args) {
        // Error - ошибки связанные с проблемами уровня JVM
        // ошибки НЕ обрабатываются

        // Exception - исключения
        // 1. исключения времени выполнения, наследники RuntimeException
        // unchecked. необрабатываемые неотслеживаемые неконтроллируемые
        // разработчики могут (по своему усмотрению) обработать данный тип исключений

        // 2. Исключения времени компиляции - все остальные наследники Exception
        // checked. обрабатываемые отслеживаемые контроллируемые
        // разработчики обязаны обработать данный тип исключений


        // RuntimeException:

        int a = 1;
        int b = 0;
        int res;
        //  res = a / b; // java.lang.ArithmeticException


        int[] ints = new int[3];
        // ints[100] = 90; // java.lang.ArrayIndexOutOfBoundsException

        String s = null;
        // s.equals("data"); // java.lang.NullPointerException

        Object obj = "hello";
        String s1 = (String) obj;
        System.out.println(s1.toUpperCase());
        // Integer integer = (Integer) obj; // java.lang.ClassCastException


        // обработка исключений (unchecked / checked ) обрабатывается одинаково
        try { // в блок трай помещается потенциально опасый код,
            // который может привести к исключению, блок всегда один.
            res = a / b; // ArithmeticException
        } catch (ArithmeticException e) { // Блоков кэтч может быть несколько
            // трай не может существовать без кэтч
            // брать только имеющийся тип исключения ArithmeticException=ArithmeticException
            System.out.println(e.getMessage());
            res = a;
        }
        System.out.println(res);


        // объединение блоков catch
        // 1. несколько блоков catch, позволяет разные исключения обработать разными способами

        Integer integer;
        try {
            if(System.currentTimeMillis() % 2==0 ) integer = (Integer) obj;
            else ints[90] = 100;

        } catch (ClassCastException e) { // перехватываем ClassCastException и всех его потомков
            System.out.println("Проблемы с приведением типов " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("Выход за пределы массива: " + e.getMessage());
        }


        // 2. несколько исключений обрабатывается одинаковым способом
        try {
            if(System.currentTimeMillis() % 2==0 ) integer = (Integer) obj;
            else ints[90] = 100;
        }
        catch (ClassCastException | ArrayIndexOutOfBoundsException e){
            System.out.println("Проблема с приведением типов или выходом за пределы массива: " + e.getMessage());
        }
        // необязательный блок finally, может быть только один
        finally {
            // инструкции выполняются в случае любого исключения в блоке трай
            // иструкции связанные с закрытием ресурсов
            // например, закрытие файла, куда записывали/закрытие соединений со стороними хранилищами и тд
        }




        // 3. через одного родителя
        try {
            if(System.currentTimeMillis() % 2==0 ) integer = (Integer) obj;
            else ints[90] = 100;
        }
        catch (RuntimeException e){
            System.out.println("Какое то исключение времени выполнения: " + e.getMessage());
        }

        // 4. через одного родителя, но какие то должны обрабатываться иначе
        try {
            if(System.currentTimeMillis() % 2==0 ) integer = (Integer) obj;
            else ints[90] = 100;
        }
        catch (ClassCastException  e){
            System.out.println("выходом за пределы массива: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("исключение времени выполнения: " + e.getMessage());
        }
        try {
            readFromJsonFile("file.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFromJsonFile(String fileName) throws IOException {
        if(!fileName.endsWith(".json")){
            throw new IOException("Проблемы с файлом");
        }
        System.out.println("Чтение из json файла");
    }

}