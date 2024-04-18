package BehavioralPatterns.Iterator;

public class ArtistSet implements ISubjects {
    private String[] subjects;

    public ArtistSet() {
        subjects = new String[2];
        subjects[0] = "Painting";
        subjects[1] = "Music";
    }

    public IIterator createIterator() {
        return new IteratorArtist(subjects);
    }
}