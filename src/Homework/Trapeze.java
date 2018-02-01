package Homework;

public class Trapeze implements Quadrangle {

    @Override
    public int getPerimeter() {
        int firstSideOfTrapeze = 2;
        int secondSideOfTrapeze = 3;
        int thirdSideOfTrapeze = 2;
        int fourthSideOfTrapeze = 4;

        return firstSideOfTrapeze + secondSideOfTrapeze + thirdSideOfTrapeze + fourthSideOfTrapeze;
    }

    @Override
    public double getSquare() {
        int secondSideOfTrapeze = 3;
        int fourthSideOfTrapeze = 4;
        double heightOfTrapeze = 1.8;

        return ((secondSideOfTrapeze + fourthSideOfTrapeze) * heightOfTrapeze) / 2;
    }

    @Override
    public String toString() {
        return "Я трапеция. Площадь: " + getSquare() + ", периметр: " + getPerimeter();
    }
}
