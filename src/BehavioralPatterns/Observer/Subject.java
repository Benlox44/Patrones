package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private int label;
    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<Observer>();
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
        // Label changed, so notify my observers
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}