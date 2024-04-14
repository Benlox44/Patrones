package StructuralPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setBase(5);
        triangle.setHeight(8);

        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        double area = calculatorAdapter.getArea(triangle);
        System.out.println("The area of the triangle is " + area);
    }
}
