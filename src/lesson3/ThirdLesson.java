package lesson3;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {

        // Пользовательский ввод
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int userNum = in.nextInt();
        System.out.println(userNum * userNum);

        while (true){
            System.out.println("Введите целое положительно число " +
                    "или 0 для выхода из программы");
            userNum = in.nextInt();
            if (userNum == 0) break; // завершение текущего цикла
            if (userNum < 0) continue; // переход на следующую итерацию
            System.out.println(userNum * userNum);
        }

        do {
            System.out.println("DO WHILE: Введите целое положительно число " +
                    "или 0 для выхода из программы");
            userNum = in.nextInt(); // 0
            if (userNum < 0) continue;
            System.out.println(userNum * userNum); // 0
        } while (userNum != 0);


        // вывести все четные числа от start до end
        // четное число % 2 == 0
        // 2 4 6 8 10 12
        int start = 1, end = 12;
        while (start <= end) {
            if (start % 2 == 0) System.out.println(start);
            start += 1;
        }

        for ( start = 1, end = 12; // инициализация переменных
              start <= end; // булевое выражение (условие)
              start += 1 /* обновление значений переменных */)
        {
            if (start % 2 == 0) System.out.println(start);
        }

        // for (start = 1, end = 12; start <= end; start += 1) {}

        // вывести все неотрицательные элементы последовательности
        // 90 85 80 75 70 65 60 и тд

        for(int num = 90; num >= 0; num -= 5){
            System.out.println(num);
        }

        // вывести на экран первые 10 элементов последовательности
        // 2 4 6 8 10 и тд (for)
        for (int count = 0, num = 2; count < 10; count += 1, num += 2) {
            System.out.println(num);
        }

        /*
        * на цикл while
        * считать с консоли количество тарелок и моющего средства
        * Моющее средство расходуется из расчета 0.5 на 1 тарелку
        * В цикле выводить сколько моющего средства осталось
        * после мытья каждой тарелки
        * После цыкла вывести сколько тарелок и моющего средства
        * осталось
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество тарелок");
        int plates = scanner.nextInt();
        System.out.println("Введите количество моющего средства");
        double fairy = scanner.nextInt();

        while (plates > 0 && fairy > 0) {
            fairy -= 0.5;
            plates -= 1;
            System.out.println(fairy);
        }
        System.out.println(fairy);
        System.out.println(plates);





        /*while (true){}
        while (false){}

        do {} while (true);
        do {} while (false);*/



    }
}
