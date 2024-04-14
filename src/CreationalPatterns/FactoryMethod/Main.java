package CreationalPatterns.FactoryMethod;

public class Main {

    public static void main (String[] args) {

        FactoriaAnimalConcreta factoriaAnimalConcreta = new FactoriaAnimalConcreta();
        factoriaAnimalConcreta.getTipoAnimal("grgrgr").hablar();

    }
}
