package Homework;

import static java.lang.Math.pow;

public class Quadrate extends Rectangle{

    private int sideOfQuadrate = 9;

    @Override
    public double getSquare() {
        return pow(sideOfQuadrate, 2);
    }

    @Override
    public int getPerimeter() {
        return 4 * sideOfQuadrate;
    }

    @Override
    public String toString() {
        return "Я квадрат. Площадь: " + getSquare() + ", периметр: " + getPerimeter()
                + ", диагональ: " + super.getDiagonal(sideOfQuadrate, sideOfQuadrate)
                + ". Я наследуюсь от " + Quadrate.class.getSuperclass();
    }
}
