package Homework;

public class Rhomb implements Quadrangle {

    @Override
    public int getPerimeter() {
        int sideOfRhomb = 5;
        return 4 * sideOfRhomb;
    }

    @Override
    public double getSquare() {
        int longerDiagonal = 7;
        int shorterDiagonal = 4;
        return (longerDiagonal * shorterDiagonal) / 2;
    }

    @Override
    public String toString() {
        return "Я ромб. Площадь: " + getSquare() + ", периметр: " + getPerimeter();
    }
}
