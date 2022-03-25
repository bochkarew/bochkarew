package lesson2;

public class ageExp {
    public static void main(String[] args) {
        int age = 99;
        int exp = 5;
        if (age > 100){
            System.out.println("мы вам перезвоним");
        }
        else if (age < 100 && exp < 5) {
            System.out.println("вы подходите на должность стажера");
        }
        else if (age < 100 || exp >= 5) {
            System.out.println("Вы подходите на должность разработчика");
        }
    }
}
