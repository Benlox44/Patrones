package CreationalPatterns.Builder;

public interface IBuilder {

    void constructObjet();
    void insertWheels();
    void putLights();
    Product getProduct();
}
