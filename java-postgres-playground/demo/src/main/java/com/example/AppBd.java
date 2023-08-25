package com.example;
import java.sql.SQLException;

import com.example.dao.ConnectionManager;
import com.example.dao.DAO;
import com.example.dao.EstadoDAO;
import com.example.dao.ProdutoDAO;
import com.example.model.Marca;
import com.example.model.Produto;


public class AppBd {
    /**
     *
        //static final diz que SÃO contante */
    /** private static final String PASSSWORD = "12345";
    private static final String USERNAME = "postgres";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    **/
    public static void main(String[] args) {
      new AppBd();
    }
// Método construtor
  
    public AppBd (){
        try(var conn = ConnectionManager.getConnection()) {
        var estadoDAO = new EstadoDAO(conn);
        estadoDAO.listar(); 
        estadoDAO.localizar( "TO");
               
        var marca = new Marca();
        marca.setId(2L);
        
        var produto = new Produto();
        produto.setId(208L);
        produto.setMarca(marca);
        produto.setNome("Produdo novo");
        produto.setValor(100);
        
        var produtoDAO = new ProdutoDAO(conn);
        produtoDAO.inserir(produto);
        produtoDAO.alterar(produto);
        produtoDAO.excluir(211L);

        var DAO = new DAO(conn);
        DAO.listar("produto");

        }catch (SQLException e) {
            System.err.println("Não foi possíel connectar ao banco de dados" + e.getMessage());
        }
    }     
}

