package com.example;



import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {

        //System.out.println("Criando um cliente");
        ClienteCadastro clienteCadastro = new ClienteCadastro();  
        Scanner sc = new Scanner(System.in);
        System.out.println("Digete o nome: ");
        clienteCadastro.setNome(sc.nextLine());

         System.out.println("Digite o seu CPF: ");
        clienteCadastro.setCpf(sc.nextLine());

         System.out.println("Digete o cidade: ");
        clienteCadastro.setCidade(sc.nextLine());

         System.out.println("Digete sua Renda: ");
        clienteCadastro.setRenda(sc.nextDouble());

         System.out.println("Digete o nome: ");
        clienteCadastro.setAnoNascimento(sc.nextInt());

        System.out.println("Digite o Sexo: ");       
        String sexo = sc.nextLine();
        clienteCadastro.setSexo(sexo.charAt(0));

            
        clienteCadastro.setSexo('M');
        clienteCadastro.setAnoNascimento(1982);
        clienteCadastro.setNome("Rafael Brenner 😂");
        String cpf = "99999999999";
        clienteCadastro.setCpf(cpf);
        clienteCadastro.setCidade("Brasília");

         
        System.out.println("CPF: " + clienteCadastro.getCpf());
        System.out.println("Nome: " + clienteCadastro.getNome());
        System.out.println("Renda: " + clienteCadastro.getRenda());
        System.out.println ("Sexo: " + clienteCadastro.getSexo());
        System.out.println("Ano de Nascimento: " + clienteCadastro.getAnoNascimento());
        System.out.println("Especial: " + clienteCadastro.isEspecial());    
        System.out.println();
        
        sc.close();

    }
    
}
