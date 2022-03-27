package ru.itmo.lessons.lesson6.Alpinist;

public class Alpinist{
    private String name;
    private String adress;

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("В имени альпиниста должно быть не менее 3 символов");
        }
        this.name = name;
    }

    public void setAdress(String adress) {
        if (adress == null || adress.length() < 5) {
            throw new IllegalArgumentException("В адресе альпиниста должно быть не менее 5 символов");
        }
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }


    public String toString() {
        return "Альпинист {" +
                "Имя='" + name + '\'' +
                ", Адрес=" + adress +

                '}';
    }
}


