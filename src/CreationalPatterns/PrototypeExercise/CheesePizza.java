package CreationalPatterns.PrototypeExercise;

import java.util.ArrayList;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.name = "Cheese";
        this.spices = new ArrayList<>();
        this.spices.add("Cheese");
        this.spices.add("Parmesan");
    }

    @Override
    public Pizza clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
