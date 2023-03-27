package pt.leo.adapter;

import pt.leo.adapter.dbreader.DBUserReader;

public class Main {
    public static void main(String[] args) {
        UserReader reader = new DBUserReader();
        System.out.println("The following users where received:");
        reader.getUsers().forEach(System.out::println);
    }
}
