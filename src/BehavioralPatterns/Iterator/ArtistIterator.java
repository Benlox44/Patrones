package BehavioralPatterns.Iterator;

public class ArtistIterator implements IIterator {
    private String[] subjects;
    private int position;

    public ArtistIterator(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public boolean done() {
        return position >= subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}