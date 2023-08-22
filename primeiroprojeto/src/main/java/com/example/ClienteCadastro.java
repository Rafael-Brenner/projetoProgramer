package com.example;



public class ClienteCadastro {
    private String cpf;    
    private String nome;
    private String cidade;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

    public ClienteCadastro(){
    System.out.println("Criando um Cliente Construtor sem parametros");
    double aleatorio = Math.random();
    if(aleatorio > 0.5)
        especial = true;

    }
    public ClienteCadastro ( double renda, char sexo, int anoNascimento){
    this(); // esse metodo esta chamando o construtor da acima ClienteCadastro e para funcionar tem que estar na 1º linha.
    System.out.println("Criando um Cliente Construtor com parametros");
    setRenda(renda);;
    this.sexo = sexo;
    this.anoNascimento = anoNascimento;
    
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
        // metodo trim tira espaços da string e o metodo toUppercase coloca o nome em maiuculo e posso chmar um atras do outro.
    }


    public void setNome(String nome) {
        if(nome.isBlank())
        System.out.println("Nome é obrigatório");
        else   this.nome = nome.trim().toUpperCase();
    }
    
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public boolean isEspecial() {
        return especial;
    }


    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    
    public double getRenda() {
        return renda;
        
    }
    public void setRenda(double renda) {
         if(renda >=0)
        this.renda = renda;
        else System.out.println("Renda deve ser maior ou igual a zero");
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F'|| sexo == 'm' || sexo == 'f')
        this.sexo = sexo;
         else System.out.println("Sexo informado invalido");
    }  
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
