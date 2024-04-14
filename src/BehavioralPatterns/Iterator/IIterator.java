package BehavioralPatterns.Iterator;

public interface IIterator {
    void first();
    String next();
    boolean done();
    String currentItem();
}