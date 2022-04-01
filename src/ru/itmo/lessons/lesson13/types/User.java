package ru.itmo.lessons.lesson13.types;
// если тип данных еще не определен, после названия класса пишем <T>, а перед неясной переменной пишем T
public class User<T> {
    private String login;
    private T id;

    public void setId(T id){
        this.id = id;
    }

    public T getId(){
        return id;
    }


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", id=" + id +
                '}';
    }
}
