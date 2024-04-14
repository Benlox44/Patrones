package CreationalPatterns.PrototypeExercise;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PizzaStore pizzaStore = new PizzaStore();

        Pizza pepperoniPizza = pizzaStore.takeOrder("pepperoni");
        pizzaStore.Bake(pepperoniPizza);
        pizzaStore.send(pepperoniPizza);

        Pizza cheesePizza = pizzaStore.takeOrder("cheese");
        pizzaStore.Bake(cheesePizza);
        pizzaStore.send(cheesePizza);

        Pizza chickenPizza = pizzaStore.takeOrder("chicken");
        pizzaStore.Bake(chickenPizza);
        pizzaStore.send(chickenPizza);
    }
}
