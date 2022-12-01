package pt.leo.observer2.core;

import java.util.ArrayList;

public class ChatRoom {
    String name;
    private final Notifier notifier;
    ArrayList<String> messages = new ArrayList<>();

    public ChatRoom(String name, Notifier notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    public void putMessage(ChatUser user, String message) {
        messages.add(user.name + ": " + message);
        System.out.println(name + " > " + user.name + ": " + message);
        notifier.notifyObservers(message);
    }
}
