package pt.leo.adapter.dbreader;

import java.util.List;

public class DBReader {
    private final List<String> users = List.of("Leo", "John", "Paul");

    public List<String> findAllUsers() {
        return users;
    }
}
