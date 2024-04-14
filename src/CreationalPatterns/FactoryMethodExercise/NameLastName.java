package CreationalPatterns.FactoryMethodExercise;

import java.util.ArrayList;

public class NameLastName implements IName {

    private static NameLastName instance;
    private ArrayList<String> names, lastNames;

    private NameLastName() {
        names = new ArrayList<>();
        lastNames = new ArrayList<>();
    }

    public static NameLastName getInstance() {
        if (instance == null) {
            instance = new NameLastName();
        }
        return instance;
    }

    @Override
    public String[] splitFullName(String fullName) {
        return fullName.split(" ");
    }

    @Override
    public void save(String[] parts) {
        names.add(parts[0]);
        lastNames.add(parts[1]);
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
