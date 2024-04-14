package BehavioralPatterns.Iterator;

public class Main {
    public static void main(String[] args) {
        ISubjects artistSubjects = new ArtistCollection();
        IIterator artistIterator = artistSubjects.createIterator();

        System.out.println("Artist Subjects:");
        while (!artistIterator.done()) {
            System.out.println(artistIterator.next());
        }
    }
}