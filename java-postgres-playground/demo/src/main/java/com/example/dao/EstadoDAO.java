package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class EstadoDAO {
    private Connection conn;

    public EstadoDAO(Connection conn) {
        this.conn = conn;
    }
    public  void listar() {  
        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("Id"), result.getString("nome"), result.getString("uf"));
            }        
              
        } catch (SQLException e) {
           System.err.println("Não foi possíel executar consulta ao ao banco de dados" + e.getMessage());
        }           
    }

    public void localizar( String uf) {
        try {
           var sql = "Select * from estado where uf = ?";                       
           var statement = conn.prepareStatement(sql);
               //System.out.println(sql);
               statement.setString(1, uf);
           var result = statement.executeQuery();
           if (result.next()) {
               System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("Id"), result.getString("nome"), result.getString("uf"));
           }
             
       } catch (SQLException e) {
            System.out.println("Erro ao executar consulta SQL: " + e.getMessage());        
            }
              
       }

}