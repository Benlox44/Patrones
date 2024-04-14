package StructuralPatterns.AdapterExercise;

import java.util.Random;

public class FahrenheitMeter {
    public double getFahrenheitTemperature() {
        return new Random().nextDouble();
    }
}
