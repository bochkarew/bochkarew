package ru.itmo.lessons.lesson9;

import java.util.Arrays;

public final class Figure {
    private final Point[] points;

    public Figure(int pointCount) {
        if(pointCount < 2){
            throw new IllegalArgumentException("Фигура должна состоять минимум из 2х точек");
        }
        this.points = new Point[pointCount];
    }


    // метод добавления точки в массив
    // одинаковые точки в массив добавлять нельзя
    public Point[] getPoints(){
        return points;
    }

    public void addPoint(Point point){
       for (int i=0; i< points.length; i++){
           if(points[i] != null && points[i].equals(point)){
               System.out.println("Точка " + point + "не была добавлена. Можно добавлять только разные точки");
               return;
           }
           if (points[i] == null){
               points[i] = point;
               System.out.println("Точка " + point + "была добавлена.");
               return;
           }
       }
        System.out.println("Точка " + point + "не была добавлена. У фигуры уже достаточно точек");
    }

    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    @Override
    public Figure clone(){
        Figure copy = new Figure(points.length);
        for (int i=0; i< points.length; i++){
            copy.points[i] = points[i].clone();
        }
        return copy;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;
        Figure figure = (Figure) o;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(points, figure.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}