package AbstractFactoryExercise;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        IPrinterFactory[] factories = {
                new ScreenPrinterFactory(), new FilePrinterFactory()
        };

        Random random = new Random();
        IPrinterFactory selectedFactory = factories[random.nextInt(factories.length)];

        IPrinter printer = selectedFactory.createPinter();

        String message = "Hola Mundo";
        printer.print(message);
    }
}
