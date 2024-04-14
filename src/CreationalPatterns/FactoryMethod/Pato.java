package CreationalPatterns.FactoryMethod;

public class Pato implements IAnimal{

    public Pato() {}

    @Override
    public void hablar() {
        System.out.println("cuac");
    }
}
