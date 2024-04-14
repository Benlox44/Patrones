package StructuralPatterns.Decorator;

public class ConcreteComponent implements Component {
    @Override
    public void doWork() {
        System.out.println("Doing basic work...");
    }
}