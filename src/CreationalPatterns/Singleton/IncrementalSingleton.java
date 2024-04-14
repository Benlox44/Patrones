package CreationalPatterns.Singleton;

public class IncrementalSingleton {

    private static IncrementalSingleton instance;
    private static int count;

    private IncrementalSingleton() {}

    public static IncrementalSingleton getInstance() {
        if (instance == null) {
            instance = new IncrementalSingleton();
        }
        count++;
        return instance;
    }

    public String toString() {
        return "Incremental " + count;
    }
}
