package ru.itmo.lessons.lesson11.enums;

public enum Planets {
    EARTH("Земля"), JUPITER("Юпитер"), PLUTON("Плутон - не планета");
    private int weight;
    private int radius;
    private String name;

    Planets(String name){
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }
}
