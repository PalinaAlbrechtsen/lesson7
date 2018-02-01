package Homework;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Rectangle implements Quadrangle {

    private int biggerSideOfRectangle = 13;
    private int smallerSideOfRectangle = 5;

    @Override
    public int getPerimeter() {
        return 2 * (biggerSideOfRectangle + smallerSideOfRectangle);
    }

    @Override
    public double getSquare() {
        return biggerSideOfRectangle * smallerSideOfRectangle;
    }

    public double getDiagonal(int a, int b){
        return sqrt(pow(a, 2) + pow(b, 2));
    }

    @Override
    public String toString() {
        return "Я прямоугольник. Площадь: " + getSquare() + ", периметр: " + getPerimeter() + ", диагональ: " + getDiagonal(biggerSideOfRectangle, smallerSideOfRectangle);
    }
}
