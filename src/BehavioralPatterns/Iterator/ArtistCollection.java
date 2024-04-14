package BehavioralPatterns.Iterator;

public class ArtistCollection implements ISubjects {
    private String[] subjects;

    public ArtistCollection() {
        subjects = new String[2];
        subjects[0] = "Painting";
        subjects[1] = "Music";
    }

    @Override
    public IIterator createIterator() {
        return new ArtistIterator(subjects);
    }
}