package CreationalPatterns.PrototypeExercise;

import java.util.ArrayList;

public class ChickenPizza extends Pizza {
    public ChickenPizza() {
        this.name = "Chicken";
        this.spices = new ArrayList<>();
        this.spices.add("Cheese");
        this.spices.add("Chicken");
    }

    @Override
    public Pizza clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
