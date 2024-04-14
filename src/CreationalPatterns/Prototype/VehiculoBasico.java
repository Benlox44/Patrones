package CreationalPatterns.Prototype;

public abstract class VehiculoBasico implements Cloneable {

    private String modelo;
    private int precio;

    public VehiculoBasico(String modelo, int precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public int setPrecio(int precio) {
        return this.precio = precio;
    }

    public VehiculoBasico clone() throws CloneNotSupportedException {
        return (VehiculoBasico) super.clone();
    }

    public String toString() {
        return "Modelo: " + modelo + ", Precio: " + precio;
    }
}
