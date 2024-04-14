package CreationalPatterns.FactoryMethodExercise;

public class Main {

    public static void main (String[] args) {

        String[] data = new String[3];
        data[0] = "Nealy, Scot";
        data[1] = "Jame Ling";
        data[2] = "Naton, Pat";

        FactoryNames factoryNames = new FactoryNames();

        for (String datum : data) {

            IName instance = factoryNames.getTypeName(datum);
            String[] splited = instance.splitFullName(datum);
            instance.save(splited);
        }

        System.out.println(NameLastName.getInstance());
        System.out.println(LastNameName.getInstance());
    }
}
