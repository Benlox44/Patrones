package AbstractFactoryExercise;

public class ScreenPinter implements IPrinter {

    public ScreenPinter(){}

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
