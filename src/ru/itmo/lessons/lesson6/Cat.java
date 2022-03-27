package ru.itmo.lessons.lesson6;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Cat extends Animal{
    private String name; // имя кота
    private int weight; // вес кота
    public Mouse caughMice[] = new Mouse[100]; // пойманные мыши

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Mouse[] getCaughMice() {
        return caughMice;
    }

    public void setCaughMice(Mouse[] caughMice) {
        this.caughMice = caughMice;
    }



}
