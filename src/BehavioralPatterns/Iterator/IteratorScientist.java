package BehavioralPatterns.Iterator;

import java.util.List;

public class IteratorScientist implements IIterator {
    private List<String> subjects;
    private int position;

    public IteratorScientist(List<String> subjects) {
        this.subjects = subjects;
        position = 0;
    }

    public void first() {
        position = 0;
    }

    public String next() {
        return subjects.get(position++);
    }

    public boolean done() {
        return position >= subjects.size();
    }

    public String currentItem() {
        return subjects.get(position);
    }
}
