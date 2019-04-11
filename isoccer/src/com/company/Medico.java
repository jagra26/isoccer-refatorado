package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Medico extends Pessoa {
    int crm;
    @Override
    public String toString() {
        return  this.nome + "\n" + this.tipo + "\ncrm: " + this.crm + "\ncpf: " + this.cpf
                + "\nemail: " + this.email + "\ntelefone: " + this.telefone + "\nsalario: " + this.salario +
                "\n-----------\n";
    }

    public Medico() {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Insira o nome:\n");
            super.nome = entrada.nextLine();
            System.out.print("Insira o email:\n");
            super.email = entrada.nextLine();
            System.out.print("insira o crm: \n");
            this.crm = entrada.nextInt();
            System.out.print("Insira o cpf:\n");
            super.cpf = entrada.nextLong();
            System.out.print("Insira o telefone:\n");
            super.telefone = entrada.nextInt();
            System.out.print("Insira o salário:\n");
            super.salario = entrada.nextDouble();
            super.tipo = "Médico";
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }

}
