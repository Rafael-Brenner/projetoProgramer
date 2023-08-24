package com.example.eleitor;

import java.time.LocalDate;

public class AppEleitor {
    
    public static void main(String[] args) {
        var cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(2015, 11, 7));
        System.out.println(cidadao.idade());
        System.out.println(cidadao.eleitor());
        

    }
}
