package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.model.Produto;

public class ProdutoDAO {
    private Connection conn;

    public ProdutoDAO(Connection conn) {
        this.conn = conn;
    }
        public void listar(Produto produto){
        System.out.println("Início da tabela produto");
                
        try {
            var sql = "select * from produto";
            var statement = conn.prepareStatement(sql);        
            var result = statement.executeQuery(); 
            
            var metadata = result.getMetaData();
            int cols = metadata.getColumnCount();

            for (int i = 1; i <= cols; i++) {
                System.out.printf("%-30s | ", metadata.getColumnName(i));
            }
            System.out.println();

            while(result.next()){
                for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-30s | ", result.getString(i));
                }
                System.out.println();
            }
            while (result.next()) {
               System.out.printf("Id: %d Nome: %s Marca: %d Valor: %d\n", result.getInt("id"), result.getString("nome"), result.getInt("marca"), result.getLong("valor"));
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível consultar a tabela Produto." + e.getMessage());           
        }
    }

 public void excluir( long id) {
            var sql = "delete from produto where id = ? ";
            try  {
                var statement = conn.prepareStatement(sql);
                statement.setLong(1, id);
                if(statement.executeUpdate() == 1)
                System.out.println("Produto excluido com sucesso!");
                else System.out.println("Produto não localizado!");
                System.out.println();
            } catch (SQLException e) {
               System.out.println("Erro na execução da exclusão" + e.getMessage());
            }

    }
       /* public void inserir(Produto produto) {
        //var sql = "insert into produto (nome, marca_id, valor) values (?, ?, ?)";

        try  {
            var statement = conn.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.executeUpdate();
            
        } catch (SQLException e) {
             System.err.println("Erro na execlução da consulta" + e.getMessage());
        }
    } */
        public void alterar(Produto produto) {
        var sql = "update produto set nome = ?, marca_id = ?, valor = ? where id = ?";

        try  {
            var statement = conn.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.setLong(4, produto.getId());
            statement.executeUpdate();
            
        } catch (SQLException e) {
             System.err.println("Erro na alteração do produto" + e.getMessage());
        }
    }

}
    

