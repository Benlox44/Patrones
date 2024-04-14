package StructuralPatterns.Adapter;

public class CalculatorAdapter {
    Calculator calculator;

    public CalculatorAdapter() {
        this.calculator = new Calculator();
    }

    public double getArea(Triangle triangle) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(triangle.getBase());
        rectangle.setWidth(0.5 * triangle.getHeight());
        return calculator.getArea(rectangle);
    }
}
