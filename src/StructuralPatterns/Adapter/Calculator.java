package StructuralPatterns.Adapter;

public class Calculator {

    public double getArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }
}
