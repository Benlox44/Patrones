package BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ScientistSet implements ISubjects {
    private List<String> subjects;

    public ScientistSet() {
        subjects = new ArrayList<>();
        subjects.add("Physics");
        subjects.add("Chemistry");
    }

    public IIterator createIterator() {
        return new IteratorScientist(subjects);
    }
}