package pt.leo.observer2.core;

public class ChatUser implements Observer {
    String name;

    public ChatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("  " + name + "'s holidays > " + message);
    }
}
