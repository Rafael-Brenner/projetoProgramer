package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.example.model.Estado;

public class EstadoDAO {
    private Connection conn;

    public EstadoDAO(Connection conn) {
        this.conn = conn;
    }
    public  List<Estado> listar() throws SQLException {  
        var lista = new LinkedList<Estado>();
        var statement = conn.createStatement();
        var result = statement.executeQuery("select * from estado");
        var metadata = result.getMetaData();
        int cols = metadata.getColumnCount();

        for (int i = 1; i <= cols; i++) {
                System.out.printf("%-19s | ", metadata.getColumnName(i));
            }
            System.out.println();

            while(result.next()){
                for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-19s | ", result.getString(i));
                }
                System.out.println();
            }
            
            while(result.next()){
                var estado = new Estado();
                estado.setId(result.getLong("Id"));
                estado.setNome(result.getString("nome"));
                estado.setUf( result.getString("uf"));
                lista.add(estado);                              
            }    
         System.out.println();
       
        return lista;           
    }
       

           /*  parametros para alinhamento  de colunas e linhas de resultado de pesquisas em BD
            var metadata = result.getMetaData();
            int cols = metadata.getColumnCount();

           for (int i = 1; i <= cols; i++) {
                System.out.printf("%-19s | ", metadata.getColumnName(i));
            }
            System.out.println();

            while(result.next()){
                for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-19s | ", result.getString(i));
                }
                System.out.println();
            } */
            
           

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