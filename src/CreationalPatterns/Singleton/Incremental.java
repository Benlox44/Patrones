package CreationalPatterns.Singleton;

public class Incremental {

    private static int count = 0;
    private int number;

    public Incremental() {
        number = ++count;
    }

    public String toString() {
        return "Incremental " + number;
    }
}
