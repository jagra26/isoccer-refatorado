package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pessoa {
    public String nome;
    public String email;
    public double cpf;
    public int telefone;
    public double salario;
    public String tipo;
    @Override
    public String toString() {
        return  this.nome + "\n" + this.tipo + "\n" + "\ncpf: " + this.cpf
                + "\nemail: " + this.email + "\ntelefone: " + this.telefone + "\nsalario: " + this.salario +
                "\n-----------\n";
    }
   public Pessoa(String tipo){
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Insira o nome:\n");
            this.nome = entrada.nextLine();
            System.out.print("Insira o email:\n");
            this.email = entrada.nextLine();
            System.out.print("Insira o cpf:\n");
            this.cpf = entrada.nextLong();
            System.out.print("Insira o telefone:\n");
            this.telefone = entrada.nextInt();
            System.out.print("Insira o salário:\n");
            this.salario = entrada.nextDouble();
            this.tipo = tipo;
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
    public Pessoa(){}
}