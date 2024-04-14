package StructuralPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decorator1 = new ConcreteDecorator1();
        Decorator decorator2 = new ConcreteDecorator2();

        decorator1.setComponent(component);
        decorator2.setComponent(decorator1);

        decorator2.doWork();
    }
}