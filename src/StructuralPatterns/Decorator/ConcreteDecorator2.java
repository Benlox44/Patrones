package StructuralPatterns.Decorator;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2() {}

    @Override
    public void doWork() {
        super.doWork();
        addAditionalWork();
    }

    private void addAditionalWork() {
        System.out.println("Adding additional work 2...");
    }
}