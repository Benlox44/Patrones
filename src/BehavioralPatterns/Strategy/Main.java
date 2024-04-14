package BehavioralPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // Set first option and execute
        context.setOption(new FirstOption());
        context.showOption("5", "7"); // Sum: 5 + 7 = 12

        // Set second option and execute
        context.setOption(new SecondOption());
        context.showOption("Hello", "World"); // Concatenate: HelloWorld
    }
}