package StructuralPatterns.AdapterExercise;

public class Main {
    public static void main(String[] args) {
        FahrenheitMeter fahrenheitMeter = new FahrenheitMeter();
        FahrenheitToCelciusObjectAdapter adapter = new FahrenheitToCelciusObjectAdapter(fahrenheitMeter);

        double temperatureInCelsius = adapter.measureTemperature();

        System.out.println("Temperature in Celsius: " + temperatureInCelsius);
    }
}
