package CreationalPatterns.Prototype;

public class Ford extends VehiculoBasico {

    public Ford(String modelo, int precio) {
        super(modelo, precio);
    }

    public VehiculoBasico clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
