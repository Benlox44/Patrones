package Builder;

public class Car implements IBuilder {

    private Product product;

    public Car() {
        product = new Product();
    }

    @Override
    public void constructObjet() {
        System.out.println("Building a car...");
        product.addPart("Car's structure");
    }

    @Override
    public void insertWheels() {
        System.out.println("Inserting wheels to the car...");
        product.addPart("Wheels");
    }

    @Override
    public void putLights() {
        System.out.println("Installing lights to the car...");
        product.addPart("Lights");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
