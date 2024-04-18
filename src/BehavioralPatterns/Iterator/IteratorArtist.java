package BehavioralPatterns.Iterator;

public class IteratorArtist implements IIterator {
    private String[] subjects;
    private int position;

    public IteratorArtist(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    public void first() {
        position = 0;
    }

    public String next() {
        return subjects[position++];
    }

    public boolean done() {
        return position >= subjects.length;
    }

    public String currentItem() {
        return subjects[position];
    }
}
