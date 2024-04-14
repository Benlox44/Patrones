package CreationalPatterns.AbstractFactory;

public class FactoriaPeliculaComedia implements IFactoriaPelicula {

    @Override
    public IPeliculaMarvel getPeliculaMarvel() {
        return null;
    }

    @Override
    public IPeliculaWarner getPeliculaWarner() {
        return null;
    }
}
