package ru.itmo.lessons.lesson6.Alpinist;

import ru.itmo.lessons.lesson6.books.Book;

import java.util.Arrays;

public class Group {
    private Alpinist[] alpinists = new Alpinist[3];
    private int alpinistCount;

    public Alpinist[] getAlpinist() {
        return alpinists;
    }


    public void addAlpinist(Alpinist... alpinists){ //  books - массив, состоящий из элементов, переданных в метод через запятую
        System.out.println(Arrays.toString(alpinists));
        for (Alpinist alpinist : alpinists) {
            addAlpinist(alpinist); // вызов метода addBook(Book book)
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
    // метод добавления нескольких книг на полку



    public void setAlpinistCount(int alpinistCount) {
        if (alpinistCount > 3 || alpinistCount < 3 ) {
            throw new IllegalArgumentException("В группе может быть только 3 альпиниста");
        }
        this.alpinistCount = alpinistCount;
    }
}



