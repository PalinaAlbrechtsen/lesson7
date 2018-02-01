package Homework;

public interface Figure {

    double getSquare();

    default boolean isEqual(Figure obj){
        return obj.getSquare() == this.getSquare();
    }
}
