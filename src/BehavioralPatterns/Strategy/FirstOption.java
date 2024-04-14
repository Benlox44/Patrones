package BehavioralPatterns.Strategy;

public class FirstOption implements IOption {
    @Override
    public void myOption(String s1, String s2) {
        System.out.println("Enter the numbers.");
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s2);
        int sum = int1 + int2;
        System.out.println("The result of the sum is: " + sum);
        System.out.println("\n*** End of strategy ***\n");
    }
}
