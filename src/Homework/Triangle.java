package Homework;

import static java.lang.Math.sqrt;

public class Triangle implements Figure {

    private static int firstSideOfTriangle = 13;
    private static int secondSideOfTriangle = 12;
    private static int thirdSideOfTriangle = 12;

    private static double getHeightOfTriangle(){
        double p = (firstSideOfTriangle + secondSideOfTriangle + thirdSideOfTriangle) / 2;

        return (2 * sqrt(p * (p - firstSideOfTriangle) * (p - secondSideOfTriangle) * (p - thirdSideOfTriangle)))
                / firstSideOfTriangle;
    }

    @Override
    public double getSquare() {
        return (firstSideOfTriangle * getHeightOfTriangle()) / 2;
    }

    @Override
    public String toString() {
        return "Я треугольник. Площадь: " + getSquare() + ", высота: " + getHeightOfTriangle();
    }
}
