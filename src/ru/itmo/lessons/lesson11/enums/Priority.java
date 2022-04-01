package ru.itmo.lessons.lesson11.enums;
// enum может создаваться со свойствами, конструктором, методами
public enum Priority {
    HIGH(10), MIDDLE(5), LOW(1); // ; в конце ставится, если после перечисления еще чего-нибудь пишем
    private int code; // по умолчанию значение 0

    Priority(int code){ // затирает дефолтный коструктор который БЕЗ аргументов
        this.code = code;
    }

    public void setCode(int code){  // метод доступен ВСЕМ элекментам перечисления согласно модификаторам
        this.code=code;
    }
    public int getCode(){
        return code;
    }
}
