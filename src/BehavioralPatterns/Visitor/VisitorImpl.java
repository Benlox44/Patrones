package BehavioralPatterns.Visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(MathematicalOperation mathematicalOperation) {
        System.out.println("Visitor attempts to change the integer");
        // Change the number
        mathematicalOperation.setIntegerNumber(200);
        System.out.println("Finishing visit");
    }
}
