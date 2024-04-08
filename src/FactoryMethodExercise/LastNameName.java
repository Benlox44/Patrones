package FactoryMethodExercise;

import java.util.ArrayList;

public class LastNameName implements IName {

    private static LastNameName instance;
    private ArrayList<String> names, lastNames;

    private LastNameName() {
        names = new ArrayList<>();
        lastNames = new ArrayList<>();
    }

    public static LastNameName getInstance() {
        if (instance == null) {
            instance = new LastNameName();
        }
        return instance;
    }

    @Override
    public String[] splitFullName(String fullName) {
        return fullName.split(", ");
    }

    @Override
    public void save(String[] parts) {
        names.add(parts[1]);
        lastNames.add(parts[0]);
    }

    public String toString()
    {
        String text = "";

        for (int i = 0; i < names.size(); i++) {
            text += names.get(i) + " " + lastNames.get(i);

            if (i != names.size() - 1)
                text += "\n";
        }
        return text;
    }
}
