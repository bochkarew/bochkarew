package lesson2;

public class randomIf {
    public static void main(String[] args) {
        double randomNumber = Math.random() * 100;
       System.out.println(randomNumber);
        if (randomNumber > 25 && randomNumber < 220){
            System.out.println("число в диапазоне");
        }
        else {
            System.out.println("число НЕ в диапазоне");
        }
    }
}
