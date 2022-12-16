package org.example;

import java.sql.SQLException;

public class User {
    private static int id;
    private String name;
    private String email;
    private int age;
    private DataBase database;

    public User(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
        id++;
    }
    public void save() throws SQLException, ClassNotFoundException {
        database = DataBase.getInstance();
        database.parseQuery("INSERT INTO user VALUES ('" + name + "', '" + email + "', " + age + ")");

    }
}
