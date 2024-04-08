package AbstractFactory;

public class PeliculaMarvel implements IPeliculaMarvel {

    private String nombre;

    public PeliculaMarvel() {};

    @Override
    public void setNombrePelicula(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombrePelicula() {
        return nombre;
    }
}
