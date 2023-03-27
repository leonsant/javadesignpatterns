package pt.leo.adapter.dbreader;

import pt.leo.adapter.UserReader;

import java.util.List;

public class DBUserReader implements UserReader {
    private final DBReader dbReader = new DBReader();

    public List<String> getUsers() {
        return dbReader.findAllUsers();
    }
}
