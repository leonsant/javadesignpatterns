package pt.leo.observer.core;

import java.util.ArrayList;

public class ChatRoom implements Observable {
    String name;
    ArrayList<Observer> observers = new ArrayList<>();
    ArrayList<String> messages = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void putMessage(ChatUser user, String message) {
        messages.add(user.name + ": " + message);
        System.out.println(name + " > " + user.name + ": " + message);
        notifyObservers();
    }

    public String getData() {
        return messages.get(messages.size() - 1);
    }
}
