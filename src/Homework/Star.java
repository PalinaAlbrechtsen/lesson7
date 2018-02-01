package Homework;

public class Star extends Triangle {

    @Override
    public double getSquare() {
        return super.getSquare() * 10;
    }

    @Override
    public String toString() {
        return "Я звезда. Площадь: " + getSquare();
    }
}
