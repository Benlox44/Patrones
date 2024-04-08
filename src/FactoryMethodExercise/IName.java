package FactoryMethodExercise;

public interface IName {

    String[] splitFullName(String fullName);
    void save(String[] parts);
    String toString();
}
