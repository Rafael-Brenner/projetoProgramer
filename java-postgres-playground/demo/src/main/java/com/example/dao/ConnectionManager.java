package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ConnectionManager
 */
public class ConnectionManager { 
   
        //static final diz que SÃO contante */
    private static final String PASSSWORD = "12345";
    private static final String USERNAME = "postgres";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSSWORD);

    }        
}