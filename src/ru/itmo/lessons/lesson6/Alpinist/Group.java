package ru.itmo.lessons.lesson6.Alpinist;

import ru.itmo.lessons.lesson6.books.Book;

import java.util.Arrays;

public class Group {
    private Alpinist[] alpinists = new Alpinist[3];
    private int alpinistCount;

    public Alpinist[] getAlpinist() {
        return alpinists;
    }


    public void addAlpinist(Alpinist... alpinists){ //  ю
        System.out.println(Arrays.toString(alpinists));
        for (Alpinist alpinist : alpinists) {
            addAlpinist(alpinist); // в
        }
    }


    public void addAlpinist(Alpinist alpinist){
        for (int i = 0; i < 3; i += 1) {
            if (alpinists[i] == null) {
                alpinists[i] = alpinist;
                return;
            }
        }
        System.out.println("Альпинисту " + alpinist.getName() + " по адресу " + alpinist.getAdress() + " не хватило места в группе" +
                ", она переходит в следующую группу ниже ");
    }
    //



    public void setAlpinistCount(int alpinistCount) {
        if (alpinistCount > 3 || alpinistCount < 3 ) {
            throw new IllegalArgumentException("В группе может быть только 3 альпиниста");
        }
        this.alpinistCount = alpinistCount;
    }
}



