package BehavioralPatterns.Observer;

public interface ISubject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}