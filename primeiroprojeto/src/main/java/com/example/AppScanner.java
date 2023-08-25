package com.example;

import java.util.Scanner;

import com.example.eleitor.Cliente;

public class AppScanner {
    public static void main(String[] args) {
        //System.out.println("Criando um cliente");
        Cliente cliente = new Cliente();  
        Scanner sc = new Scanner(System.in);
        System.out.println("Digete o nome: ");
        cliente.setNome(sc.nextLine());

         System.out.println("Digite o seu CPF: ");
        cliente.setCpf(sc.nextLine());

         System.out.println("Digete o cidade: ");
        cliente.setCidade(sc.nextLine());

         System.out.println("Digete sua Renda: ");
        cliente.setRenda(sc.nextDouble());

         System.out.println("Digete o seu Ano de Nascimento: ");
        cliente.setAnoNascimento(sc.nextInt());

       sc.nextLine();
        System.out.println("Digite o Sexo: ");       
        String sexo = sc.nextLine();
        cliente.setSexo(sexo.charAt(0));        
                
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println ("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());    
        System.out.println();
        
        sc.close();

    }
    
}
