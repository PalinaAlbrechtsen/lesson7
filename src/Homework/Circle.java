package Homework;

import static java.lang.Math.pow;

public class Circle implements Figure{

    @Override
    public double getSquare() {
        final double PI = 3.14159;
        double r = 23.5;

        return PI*pow(r, 2);
    }

    @Override
    public String toString() {
        return "Я круг. Люблю всё вокруг. Моя площадь: " + getSquare();
    }
}
