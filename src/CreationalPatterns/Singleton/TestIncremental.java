package CreationalPatterns.Singleton;

public class TestIncremental {

    public static void main (String[] args) {

        for (int i = 0; i < 10; i++) {
            Incremental inc = new Incremental();
            System.out.println(inc);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            IncrementalSingleton inc = IncrementalSingleton.getInstance();
            System.out.println(inc);
        }
    }
}
