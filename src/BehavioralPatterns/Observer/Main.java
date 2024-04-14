package BehavioralPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("### Observer Pattern ###\n");

        Observer observer1 = new Observer();
        Subject subject1 = new Subject();
        subject1.registerObserver(observer1);

        System.out.println("Changing label to 5");
        subject1.setLabel(5);

        System.out.println("Changing label to 25");
        subject1.setLabel(25);

        subject1.removeObserver(observer1);
        // There will be no notification
        System.out.println("Changing label to 0");
        subject1.setLabel(0);
    }
}
