package pt.leo.observer.main;

import pt.leo.observer.core.ChatRoom;
import pt.leo.observer.core.ChatUser;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Preparing chat room and users
        ChatRoom holidaysRoom = new ChatRoom("holidays");
        ChatUser user1 = new ChatUser("John", holidaysRoom);
        ChatUser user2 = new ChatUser("Paul", holidaysRoom);

        // Registering observers
        holidaysRoom.addObserver(user1);
        holidaysRoom.addObserver(user2);

        // Sending some messages to chat room
        holidaysRoom.putMessage(user1, "Hi! Any suggestions of good places to visit?");
        sleep(5000);
        holidaysRoom.putMessage(user2, "I love Algarve beaches! I am visiting Portugal in my next holidays!");
        sleep(5000);
        holidaysRoom.putMessage(user1, "Yeah ... Definetely something to consider. Thanks for the suggestion, Paul!");
    }
}
