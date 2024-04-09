package Builder;

public class Director {

    IBuilder builder;

    public void constructor(IBuilder builder) {
        this.builder = builder;
        builder.constructObjet();
        builder.insertWheels();
        builder.putLights();
    }
}