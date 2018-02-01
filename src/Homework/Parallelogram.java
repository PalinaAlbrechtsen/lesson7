package Homework;

public class Parallelogram implements Quadrangle {

    @Override
    public double getSquare() {
        int biggerSideOfParallelogram = 10;
        int heightOfParallelogram = 6;

        return biggerSideOfParallelogram * heightOfParallelogram;
    }

    @Override
    public int getPerimeter() {
        int biggerSideOfParallelogram = 10;
        int smallerSideOfParallelogram = 7;

        return 2 * (biggerSideOfParallelogram + smallerSideOfParallelogram);
    }

    @Override
    public String toString() {
        return "Я параллелограмм. Площадь: " + getSquare() + ", периметр: " + getPerimeter();
    }
}
