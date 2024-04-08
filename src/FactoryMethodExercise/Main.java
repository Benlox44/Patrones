package FactoryMethodExercise;

public class Main {

    public static void main (String[] args) {

        String[] data = new String[3];
        data[0] = "Nealy, Scot";
        data[1] = "Jame Ling";
        data[2] = "Naton, Pat";

        FactoryNames factoryNames = new FactoryNames();

        for (int i = 0; i < data.length; i++) {

            IName instance = factoryNames.getTypeName(data[i]);
            String[] splited = instance.splitFullName(data[i]);
            instance.save(splited);
        }

        System.out.println(NameLastName.getInstance());
        System.out.println(LastNameName.getInstance());
    }
}
