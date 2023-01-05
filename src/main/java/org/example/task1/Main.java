package org.example.task1;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        User user = new User("Alice", "alice@ucu.edu.ua", 20);
        user.save();
    }
}
