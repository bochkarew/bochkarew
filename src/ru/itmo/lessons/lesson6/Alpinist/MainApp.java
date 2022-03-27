package ru.itmo.lessons.lesson6.Alpinist;

public class MainApp{

    public static void main(String[] args) {

        Mountain mountain1 = new Mountain();
        mountain1.setMountainName("Mount 1");
        mountain1.setCountry("Country 1");
        mountain1.setHeight(200);

        Mountain mountain2 = new Mountain();
        mountain1.setMountainName("Mount 2");
        mountain1.setCountry("Country 3");
        mountain1.setHeight(300);

        Mountain mountain3 = new Mountain();
        mountain1.setMountainName("Mount 3");
        mountain1.setCountry("Country 3");
        mountain1.setHeight(400);

        Alpinist alpinist1 = new Alpinist();
        alpinist1.setName("denis");
        alpinist1.setAdress("prospect");

        Alpinist alpinist2 = new Alpinist();
        alpinist2.setName("dima");
        alpinist2.setAdress("street");

        Alpinist alpinist3 = new Alpinist();
        alpinist3.setName("ivan");
        alpinist3.setAdress("avenue");

        Alpinist alpinist4 = new Alpinist();
        alpinist4.setName("ola");
        alpinist4.setAdress("highway");

        Alpinist alpinist5 = new Alpinist();
        alpinist5.setName("gena");
        alpinist5.setAdress("dalekooo");

        Alpinist alpinist6 = new Alpinist();
        alpinist6.setName("gosha");
        alpinist6.setAdress("moscow");

        Alpinist alpinist7 = new Alpinist();
        alpinist7.setName("volodya");
        alpinist7.setAdress("saintp");

        Alpinist alpinist8 = new Alpinist();
        alpinist8.setName("andy");
        alpinist8.setAdress("elizarova");

        Alpinist alpinist9 = new Alpinist();
        alpinist9.setName("sasha");
        alpinist9.setAdress("baumana");


        Group group1 = new Group();
        group1.addAlpinist(alpinist1, alpinist2, alpinist3, alpinist4);

        Group group2 = new Group();
        group2.addAlpinist(alpinist4, alpinist5, alpinist6);

        Group group3 = new Group();
        group3.addAlpinist(alpinist7, alpinist8, alpinist9);




    }
}