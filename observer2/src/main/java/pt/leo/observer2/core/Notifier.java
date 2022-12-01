package pt.leo.observer2.core;

public interface Notifier {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
