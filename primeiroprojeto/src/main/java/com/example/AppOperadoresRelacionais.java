package com.example;
import java.util.Scanner;

import com.example.eleitor.Cliente;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var cliente1 = new Cliente();
        System.out.println("Digite o ano de nascimento do cliente 1:");
        cliente1.setAnoNascimento(sc.nextInt());

        var cliente2 = new Cliente();
        System.out.println("Digite o ano de nascimento do cliente 2:");
        cliente2.setAnoNascimento(sc.nextInt());
        
        if (cliente1.getAnoNascimento() > cliente2.getAnoNascimento() ) {
                System.out.println("Os cliente 1 é mais jovem que cliente 2!");
        }          
        else if(cliente1.getAnoNascimento() < cliente2.getAnoNascimento()){
                System.out.println("Os clientes 1 é maios velho que cliente 2:");
        }
            else System.out.println("Os clientes tem a mesma idade:");
        
        sc.close();
    }
}
