package com.example;



public class AppClas {
    public static void main(String[] args) {

        //System.out.println("Criando um cliente");
        ClienteCadastro clienteCadastro = new ClienteCadastro();  
        clienteCadastro.setRenda(-10000);    
        clienteCadastro.setSexo('M');
        clienteCadastro.setAnoNascimento(1982);
        clienteCadastro.setNome("Rafael Brenner 😂");
        String cpf = "99999999999";
        clienteCadastro.setCpf(cpf);
        clienteCadastro.setCidade("Brasília");

//        Var vetorNome = clienteCadastro.getNome().split(" ");
//        System.out.println(vetorNome [0]);
//        System.out.println(vetorNome [1]);
        
        System.out.println("1º caractere do nome: " + clienteCadastro.getNome().charAt(0));
 
        System.out.println("CPF: " + clienteCadastro.getCpf());
        System.out.println("Nome: " + clienteCadastro.getNome());
        System.out.println("Renda: " + clienteCadastro.getRenda());
        System.out.println ("Sexo: " + clienteCadastro.getSexo());
        System.out.println("Ano de Nascimento: " + clienteCadastro.getAnoNascimento());
        System.out.println("Especial: " + clienteCadastro.isEspecial());    
        System.out.println();
        
        ClienteCadastro clientesCadastro2 = new ClienteCadastro( 2000, 'F', 1984);
        clientesCadastro2.setNome("Alyne Samagaio");
        clientesCadastro2.setCpf(cpf);
        clientesCadastro2.setCidade("BRASÍLIA");
        System.out.println();

        if(clienteCadastro.getCpf() .equals(clientesCadastro2.getCpf()))
        System.out.println("Cliente 1 e cliente tem o mesmo CPF.");
        else System.out.println("Cliente 1 e Cliente 2 tem cpf diferentes.");
         System.out.println();

           if(clienteCadastro.getCidade() .equalsIgnoreCase(clientesCadastro2.getCidade()))
        System.out.println("Cliente 1 e cliente 2 mora na mesma cidade.");
        else System.out.println("Cliente 1 e Cliente 2 mora em cidades diferente.");
         System.out.println();

        System.out.println("CPF: " + clientesCadastro2.getCpf());
        System.out.println("Nome: " + clientesCadastro2.getNome());
        System.out.println("Renda: " + clientesCadastro2.getRenda());
        System.out.println ("Sexo: " + clientesCadastro2.getSexo());
        System.out.println("Ano de Nascimento: " + clientesCadastro2.getAnoNascimento());
        System.out.println("Especial: " + clientesCadastro2.isEspecial());

    }
}
