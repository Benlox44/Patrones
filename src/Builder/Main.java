package Builder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        IBuilder carBuilder = new Car();

        //Building a car
        director.constructor(carBuilder);
        Product p1 = carBuilder.getProduct();
        p1.show();
    }
}
