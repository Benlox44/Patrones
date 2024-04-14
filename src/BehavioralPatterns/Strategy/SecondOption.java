package BehavioralPatterns.Strategy;

public class SecondOption implements IOption {
    @Override
    public void myOption(String s1, String s2) {
        System.out.println("Concatenate numbers.");
        System.out.println("The result is: " + s1 + s2);
        System.out.println("\n*** End of strategy ***\n");
    }
}