package com.cleancode.comments.badcomments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// *********
// CLASS
// *********
// Acts as an adapter, connecting models to various database engines (SQL, MongoDB, MariaDB)
public class BadComments {

    //the database engine to which we connect
    private Connection dbEngine;

    void loadDatabaseDriver(String driver) {
        if (driver.equals("sql")) {
            // Connect to the SQL Driver if "driver" is set to SQL
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            // Otherwise, connect to MongoDB
            try {
                Class.forName("org.mongodb.driver.MongoDriver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    // This may fail and throw and error
    void connect() {
        try {
            dbEngine = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void insertData(Object data) {
        try {
            dbEngine.createStatement().execute("INSERT INTO USER " + data); // update a user
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
