package com.example.model;

public class Estado {
    private Long id;
    private String nome;
    private String uf;
    private RegiaoGeografica regiao;
    private Long areakm2;
    private Long populacao;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public RegiaoGeografica getRegiao() {
        return regiao;
    }
    public void setRegiao(RegiaoGeografica regiao) {
        this.regiao = regiao;
    }
    public Long getAreakm2() {
        return areakm2;
    }
    public void setAreakm2(Long areakm2) {
        this.areakm2 = areakm2;
    }
    public Long getPopulacao() {
        return populacao;
    }
    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }



}
