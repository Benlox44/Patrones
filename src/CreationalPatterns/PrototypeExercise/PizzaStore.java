package CreationalPatterns.PrototypeExercise;

public class PizzaStore {
    private CheesePizza cheesePizza = new CheesePizza();
    private ChickenPizza chickenPizza = new ChickenPizza();
    private PepperoniPizza pepperoniPizza = new PepperoniPizza();

    public Pizza takeOrder(String name) throws CloneNotSupportedException {
        Pizza pizza = null;
        switch (name.toLowerCase()) {
            case "cheese":
                pizza = cheesePizza.clone();
                break;
            case "chicken":
                pizza = chickenPizza.clone();
                break;
            case "pepperoni":
                pizza = pepperoniPizza.clone();
                break;
            default:
                throw new IllegalArgumentException("Invalid pizza name");
        }
        System.out.println("Pizza order taken");
        return pizza;
    }

    public void Bake(Pizza pizza) {
        pizza.bake();
    }

    public void send(Pizza pizza) {
        System.out.println( pizza.getName() + " pizza has been sent");
    }
}
