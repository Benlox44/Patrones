package CreationalPatterns.AbstractFactoryExercise;

public class ScreenPrinterFactory implements IPrinterFactory {
    @Override
    public IPrinter createPinter() {
        return new ScreenPinter();
    }
}