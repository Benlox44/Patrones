package AbstractFactoryExercise;

public class FilePrinterFactory implements IPrinterFactory {

    @Override
    public IPrinter createPinter() {
        return new FilePrinter();
    }
}
