package pt.leo.observer.core;

public class ChatUser implements Observer {
    String name;
    ChatRoom chatRoom;

    public ChatUser(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    @Override
    public void update() {
        System.out.println("  " + name + "'s holidays > " + chatRoom.getData());
    }
}
