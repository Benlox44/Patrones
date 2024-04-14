package CreationalPatterns.Builder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        IBuilder car = new Car();

        //Building a car
        director.build(car);
        Product p1 = car.getProduct();
        p1.show();
    }
}
