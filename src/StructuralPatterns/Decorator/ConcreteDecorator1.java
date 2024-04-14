package StructuralPatterns.Decorator;

public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1() {}

    @Override
    public void doWork() {
        super.doWork();
        addAditionalWork();
    }

    private void addAditionalWork() {
        System.out.println("Adding additional work 1...");
    }
}