package CreationalPatterns.Prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        VehiculoBasico fordBasico = new Ford("Ford Rojo", 100000);

        //Clonar objeto Ford
        VehiculoBasico vehiculoBasico1 = fordBasico.clone();
        //Precio sera mayor a 8000000
        int n = fordBasico.getPrecio() + vehiculoBasico1.getPrecio();
        vehiculoBasico1.setPrecio(n);
        System.out.println(vehiculoBasico1);
    }
}
