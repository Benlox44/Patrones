package CreationalPatterns.Builder;

public class Director {

    IBuilder builder;

    public void build(IBuilder builder) {
        this.builder = builder;
        builder.constructObjet();
        builder.insertWheels();
        builder.putLights();
    }
}