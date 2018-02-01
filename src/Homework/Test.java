package Homework;

public class Test {

    public static void main(String[] args) {
        Figure circle = new Circle();
        Figure parallelogram = new Parallelogram();
        Figure quadrate = new Quadrate();
        Figure rectangle = new Rectangle();
        Figure rhomb = new Rhomb();
        Figure star = new Star();
        Figure trapeze = new Trapeze();
        Figure triangle = new Triangle();

        System.out.println("Звезда и квадрат имеют равную площадь? " + star.isEqual(quadrate));
        System.out.println(trapeze.toString());
        System.out.println("Круг - это Прямоугольник. " + ShapeUtils.isRectangle(circle));
        System.out.println("Параллелограмм - это Прямоугольник. " + ShapeUtils.isRectangle(parallelogram));
        System.out.println("Треугольник - это Треугольник. " + ShapeUtils.isTriangle(triangle));
        System.out.println("Прямоугольник - это Треугольник. " + ShapeUtils.isTriangle(rectangle));
        System.out.println(rhomb.toString());
        System.out.println(quadrate.toString());
    }
}
