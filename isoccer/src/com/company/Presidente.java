package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Presidente extends Pessoa{
    double taxaElite;
    double taxaSenior;
    double taxaJunior;

    public Presidente(){
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Insira o nome:\n");
            super.nome = entrada.nextLine();
            System.out.print("Insira o email:\n");
            super.email = entrada.nextLine();
            System.out.print("Insira o cpf:\n");
            super.cpf = entrada.nextLong();
            System.out.print("Insira o telefone:\n");
            super.telefone = entrada.nextInt();
            System.out.print("Insira o salário:\n");
            super.salario = entrada.nextDouble();
            System.out.print("Insira a taxa de socio elite:\n");
            this.taxaElite = entrada.nextDouble();
            System.out.print("Insira a taxa de socio senior:\n");
            this.taxaSenior = entrada.nextDouble();
            System.out.print("Insira a taxa de socio junior:\n");
            this.taxaJunior = entrada.nextDouble();
            System.out.print("\n");
            this.tipo = "Presidente";
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }

    }
}
