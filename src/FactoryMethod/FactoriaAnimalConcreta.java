package FactoryMethod;

public class FactoriaAnimalConcreta implements IFactoriaAnimal{

    @Override
    public IAnimal getTipoAnimal(String sonido) {

        if (sonido.equals("cuac")) {
            return new Pato();
        }

        if (sonido.equals("grgrgr")) {
            return new Tigre();
        }

        return null;
    }
}