package com.example.eleitor;

import java.util.ArrayList;
import java.util.List;

import com.example.Cliente;

public class AppListas {
    
    public static void main(String[] args) {
        
        List<Cliente> listaClientes = new ArrayList<>();
        var cliente1 = new Cliente();
        cliente1.setNome("Rafael Brenner ");
        cliente1.setCidade("Brasília");

        var cliente2 = new Cliente();
        cliente2.setNome("Giovanna ");
        cliente2.setCidade("Ceilândia");

        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);

        listaClientes.remove(0);
        listaClientes.remove(0);
        listaClientes.remove(0);

        // função para remover o ultimo elemento da lista
        int i = listaClientes.size() -1;
        listaClientes.remove(i);

    for (Cliente cliente : listaClientes) {

    System.out.println(cliente);
}

        



    }
}
