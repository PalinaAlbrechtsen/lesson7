package Homework;

public class ShapeUtils {

    public static boolean isRectangle(Figure object){
        return object instanceof Rectangle;
    }

    public static boolean isTriangle(Figure object){
        return object instanceof Triangle;
    }
}
