package CreationalPatterns.AbstractFactory;

public class FactoriaPeliculaComedia implements IFactoriaPelicula {

    @Override
    public IPeliculaMarvel getPeliculaMarvel() {
        return new PeliculaMarvel();
    }

    @Override
    public IPeliculaWarner getPeliculaWarner() {
        return new PeliculaWarner();
    }
}
