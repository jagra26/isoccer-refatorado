package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CT {
    String nome;
    int dormitorios;
    CT(){
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("insira um nome\n");
            this.nome = entrada.nextLine();
            System.out.print("insira o nº de dormitorios\n");
            this.dormitorios = entrada.nextInt();
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
}
