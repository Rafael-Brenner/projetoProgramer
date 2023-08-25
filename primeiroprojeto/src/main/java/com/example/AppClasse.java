package com.example;

import com.example.eleitor.Cliente;

public class AppClasse {
    public static void main(String[] args) {

        //System.out.println("Criando um cliente");
        Cliente cliente = new Cliente();  
        cliente.setRenda(-10000);    
        cliente.setSexo('M');
        cliente.setAnoNascimento(1982);
        cliente.setNome("Rafael Brenner ");
        String cpf = "99999999999";
        cliente.setCpf(cpf);
        cliente.setCidade("Brasília");

       var vetorNome = cliente.getNome().split(" ");
       System.out.println(vetorNome [0]);
       System.out.println(vetorNome [1]);
        
        System.out.println("1º caractere do nome: " + cliente.getNome().charAt(0));
 
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println ("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());    
        System.out.println();
        
        Cliente cliente2 = new Cliente( 2000, 'F', 1984);
        cliente2.setNome("Alyne Samagaio");
        cliente2.setCpf(cpf);
        cliente2.setCidade("BRASÍLIA");
        System.out.println();

        if(cliente.getCpf() .equals(cliente2.getCpf()))
        System.out.println("Cliente 1 e cliente tem o mesmo CPF.");
        else System.out.println("Cliente 1 e Cliente 2 tem cpf diferentes.");
         System.out.println();

           if(cliente.getCidade() .equalsIgnoreCase(cliente2.getCidade()))
        System.out.println("Cliente 1 e cliente 2 mora na mesma cidade.");
        else System.out.println("Cliente 1 e Cliente 2 mora em cidades diferente.");
         System.out.println();

        System.out.println("CPF: " + cliente2.getCpf());
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println ("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Especial: " + cliente2.isEspecial());

    }
}
