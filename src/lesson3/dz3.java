package lesson3;
import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача 1");
        for (int i = 0, num = 1; i < 55; i += 1, num += 2) {
            System.out.print(num + " ");
        }


        // ==========================
        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше нуля");
        int number = scanner.nextInt(); // вводим число в консоли
        int summ = 0;
        while (number != 0) { // пока число НЕ равно нулю
            summ = summ + number % 10; // остаток от деления
            number /= 10; // количество десятков в числе
        }
        System.out.println(summ); // выводим сумму


        //=========================
        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        int numProgram = (int) (1 + Math.random() * 9); // задаем диапазон от 1 до 9
        int numUser = 20; // число пользователя??
        Scanner in = new Scanner(System.in); // вводим число в консоль
        System.out.println(numProgram); // выводим загаданное число
        while (numUser != 0) {
            System.out.println("Угадайте число [1;9] ");
            numUser = in.nextInt(); // 0

            if (numUser == numProgram) {
                System.out.println("Вы угадали");
                break;
            }
            if (numUser > numProgram) {
                System.out.println("Загаданное число меньше");
                continue;
            }
            if (numUser < numProgram) {
                System.out.println("Загаданное число больше");
            }
        }


        //=========================
        System.out.println();
        System.out.println("Задача 4");
        System.out.println();


        int randomNumber = 1 + (int) (Math.random() * 8);
        //Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int userNum = in.nextInt();
        while (userNum != randomNumber) {
            System.out.println("Введите целое число");
            userNum = in.nextInt();
            if (userNum == 0) {
                System.out.println("Выход из программы");
                break;
            }
            if (userNum > randomNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
            if (userNum == randomNumber) {
                System.out.println("Вы угадали");
                break;
            }

        }


        //=========================
        System.out.println();
        System.out.println("Задача 5");
        System.out.println();


        int a = 1, b = 9;
        int c = a + (int) (Math.random() * b);
        System.out.println(c);
        Scanner s = new Scanner(System.in);
        while (true) {
            int x = s.nextInt();
            if (x == 0) {
                System.out.println("Выход");
                break;
            }
            if (x == c) {
                System.out.println("Угадал");
                break;
            } else if (x < c) System.out.println("Число больше");
            else System.out.println("Число меньше");
        }



        //=========================
        System.out.println();
        System.out.println("Задача 6");
        System.out.println();


        int start = 2; // начало диапазона
        int finish = 100; // конец диапазона
        int center;

        while (true) {
            center = (start + finish) / 2; // делим отрезок на 2
            System.out.println("число = " + center + "?");
            int answer = scanner.nextInt(); // вводим ответ в консоль
            if (answer == 1) break;
            System.out.println("число > " + center + "?");
            answer = scanner.nextInt(); // вводим ответ в консоль
            if (answer == 1) start = center;
            else if (answer == 0) finish = center;
        }
    }
}
