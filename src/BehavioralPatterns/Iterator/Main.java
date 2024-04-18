package BehavioralPatterns.Iterator;

public class Main {
    public static void main(String[] args) {
        ISubjects artistSubjects = new ArtistSet();
        IIterator artistIterator = artistSubjects.createIterator();
        System.out.println("Artist Subjects:");
        while (!artistIterator.done()) {
            System.out.println(artistIterator.next());
        }

        ISubjects scientistSubjects = new ScientistSet();
        IIterator scientistIterator = scientistSubjects.createIterator();
        System.out.println("\nScientist Subjects:");
        while (!scientistIterator.done()) {
            System.out.println(scientistIterator.next());
        }
        System.out.println("\nArtist Subjects:");
    }
}