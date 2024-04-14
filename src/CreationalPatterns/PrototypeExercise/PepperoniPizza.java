package CreationalPatterns.PrototypeExercise;

import java.util.ArrayList;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        this.name = "Pepperoni";
        this.spices = new ArrayList<>();
        this.spices.add("Cheese");
        this.spices.add("Pepperoni");
    }

    @Override
    public Pizza clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
