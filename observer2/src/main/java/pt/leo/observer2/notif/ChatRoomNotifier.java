package pt.leo.observer2.notif;

import pt.leo.observer2.core.Notifier;
import pt.leo.observer2.core.Observer;

import java.util.ArrayList;

public class ChatRoomNotifier implements Notifier {
    ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
