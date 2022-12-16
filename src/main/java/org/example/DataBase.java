package org.example;

import java.sql.*;

public class DataBase {
    private static DataBase dataBase;
    private final Connection connection;
    private String stm;
    private Statement stmt = null;
//    public static void main( String args[] ) {
//        Connection c = null;
//        Statement stmt = null;
//
//        try {
//            Class.forName("org.sqlite.JDBC");
//            c = DriverManager.getConnection("jdbc:sqlite:test.db");
//            System.out.println("Opened database successfully");
//
//            stmt = c.createStatement();
//            String sql = "CREATE TABLE user (ID integer primary key autoincrement, NAME  TEXT,  EMAIL  TEXT,  AGE INTEGER)";
//            stmt.executeUpdate(sql);
//            sql = "insert into user (email, name, age) values ('dobosevych@ucu.edu.ua', 'Oles', 31);\n";
//            stmt.executeUpdate(sql);
//            stmt.close();
//            c.close();
//        } catch ( Exception e ) {
//            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//            System.exit(0);
//        }
//        System.out.println("Table created successfully");
//    }

    private DataBase() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:user.db");
        stmt = connection.createStatement();
        stm = "CREATE TABLE user (NAME  TEXT,  EMAIL  TEXT,  AGE INTEGER)";
        stmt.executeUpdate(stm);

    }

    public void parseQuery(String query) throws SQLException {
        stmt = connection.createStatement();
        stmt.executeUpdate(query);
        stmt.close();

    }
    public static DataBase getInstance() throws ClassNotFoundException, SQLException {
        if (dataBase == null){
            dataBase = new DataBase();
//            Class.forName("org.sqlite.JDBC");
        }
        return dataBase;

        }
    }
