package BehavioralPatterns.Visitor;

public class Main {
    public static void main(String[] args) {
        OriginalInterface operation = new MathematicalOperation();
        Visitor visitor = new VisitorImpl();
        operation.accept(visitor);
    }
}