package ru.itmo.lessons.lesson9;
// в одном файле может быть только один PUBLIC класс, все остальные (сколько угодно) неPUBLIC
// все классы в языке наследуются от класса Object
public class Point implements Cloneable{
    private int x;
    private int y;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public Point clone() {
        // если в методе clone мы обращаемся к родителю Object (через super),
        // то надо в класс поставить implements Cloneable
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
