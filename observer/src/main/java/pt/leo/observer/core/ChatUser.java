package pt.leo.observer.core;

public class ChatUser implements Observer {
    String name;
    Observable observable;

    public ChatUser(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("  " + name + "'s holidays > " + observable.getData());
    }
}
