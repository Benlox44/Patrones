package FactoryMethodExercise;

public class FactoryNames implements IFactoryNames {

    @Override
    public IName getTypeName(String fullName) {

        if (fullName.contains(", "))
            return LastNameName.getInstance();

        if (fullName.contains(" "))
            return NameLastName.getInstance();

        return null;
    }
}
