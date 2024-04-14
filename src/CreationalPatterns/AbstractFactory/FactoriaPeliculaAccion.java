package CreationalPatterns.AbstractFactory;

public class FactoriaPeliculaAccion implements IFactoriaPelicula {

    @Override
    public IPeliculaMarvel getPeliculaMarvel() {
        return new PeliculaMarvel();
    }

    @Override
    public IPeliculaWarner getPeliculaWarner() {
        return new PeliculaWarner();
    }
    
}
