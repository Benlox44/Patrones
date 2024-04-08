package AbstractFactory;

import FactoryMethodExercise.IFactoryNames;

public class Main {

    public static void main (String[] args) {

        //Peliculas Marvel con categoria accion y comedia

        IFactoriaPelicula factoriaAccion = new FactoriaPeliculaAccion();
        IFactoriaPelicula factoriaComedia = new FactoriaPeliculaComedia();

        IPeliculaMarvel accionMarvel = factoriaAccion.getPeliculaMarvel();
        IPeliculaMarvel comediaMarvel = factoriaComedia.getPeliculaMarvel();

        accionMarvel.setNombrePelicula("Iron Man");
        comediaMarvel.setNombrePelicula("Dead Pool");

        System.out.println(accionMarvel.getNombrePelicula());
        System.out.println(comediaMarvel.getNombrePelicula());
    }
}
