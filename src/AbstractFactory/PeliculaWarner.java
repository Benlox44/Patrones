package AbstractFactory;

public class PeliculaWarner implements IPeliculaWarner {

    private String nombre;

    public PeliculaWarner() {};

    @Override
    public void setNombrePelicula(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombrePelicula() {
        return nombre;
    }
}
