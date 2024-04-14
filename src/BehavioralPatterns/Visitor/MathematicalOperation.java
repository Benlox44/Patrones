package BehavioralPatterns.Visitor;

public class MathematicalOperation implements OriginalInterface {
    private int integerNumber = 10;

    public void setIntegerNumber(int number) {
        this.integerNumber = number;
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Initial value of my integer: " + integerNumber);
        // Visitor arrives
        visitor.visit(this);
        System.out.println("Final value of my integer: " + integerNumber);
    }
}