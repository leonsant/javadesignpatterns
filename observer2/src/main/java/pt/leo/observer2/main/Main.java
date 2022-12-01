package pt.leo.observer2.main;

import pt.leo.observer2.core.ChatRoom;
import pt.leo.observer2.core.ChatUser;
import pt.leo.observer2.notif.ChatRoomNotifier;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create notifier
        ChatRoomNotifier chatRoomNotifier = new ChatRoomNotifier();

        // Preparing chat room and users
        ChatRoom holidaysRoom = new ChatRoom("holidays", chatRoomNotifier);
        ChatUser user1 = new ChatUser("John");
        ChatUser user2 = new ChatUser("Paul");

        chatRoomNotifier.addObserver(user1);
        chatRoomNotifier.addObserver(user2);



        // Sending some messages to chat room
        holidaysRoom.putMessage(user1, "Hi! Any suggestions of good places to visit?");
        sleep(5000);
        holidaysRoom.putMessage(user2, "I love Algarve beaches! I am visiting Portugal in my next holidays!");
        sleep(5000);
        holidaysRoom.putMessage(user1, "Yeah ... Definetely something to consider. Thanks for the suggestion, Paul!");
    }
}
