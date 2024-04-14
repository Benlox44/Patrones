package CreationalPatterns.PrototypeExercise;

import java.util.List;

abstract class Pizza implements Cloneable {
    protected String name;
    protected List<String> spices;
    protected String state;

    public String getName() {
        return name;
    }

    public List<String> getSpices() {
        return spices;
    }

    public String getState() {
        return state;
    }

    @Override
    public Pizza clone() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }

    public void bake() {
        this.state = "Bake";
        System.out.println("Baking pizza");
    }
}
