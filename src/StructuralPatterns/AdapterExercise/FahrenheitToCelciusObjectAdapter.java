package StructuralPatterns.AdapterExercise;

public class FahrenheitToCelciusObjectAdapter implements CelsiusMeterIF {
    private FahrenheitMeter fahrenheitMeter;

    public FahrenheitToCelciusObjectAdapter(FahrenheitMeter fahrenheitMeter) {
        this.fahrenheitMeter = fahrenheitMeter;
    }

    @Override
    public double measureTemperature() {
        double fahrenheitTemperature = fahrenheitMeter.getFahrenheitTemperature();
        return (fahrenheitTemperature - 32) / 1.8;
    }
}
