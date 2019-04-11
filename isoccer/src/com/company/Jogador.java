package com.company;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogador extends Pessoa {
    String apto;
    @Override
    public String toString() {
        return  this.nome + "\n" + this.tipo + "\n" + this.apto + "\ncpf: " + this.cpf
                + "\nemail: " + this.email + "\ntelefone: " + this.telefone + "\nsalario: " + this.salario +
                "\n-----------\n";
    }
    public Jogador(){
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
            posicoes();
            super.tipo = posicao(entrada.nextInt());
            inapto();
            this.apto = dm(entrada.nextInt());
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
        }
    private String posicao(int camisa){
        switch (camisa){
            case 1:
                return "goleiro";
            case 2:
                return "lateral direito";
            case 3:
                return "zagueiro";
            case 5:
                return "volante";
            case 6:
                return "lateral esquerdo";
            case 9:
                return "atacante";
            case 10:
                return "meia";
        }
        return "error";
    }
    private String dm(int apto){
        if (apto == 1){return "apto";}
        return "inapto";
    }
    private void posicoes(){
        System.out.print("insira a posição do jogador\n" +
                "goleiro -- 1\n" +
                "lateral direito -- 2\n" +
                "zagueiro -- 3\n" +
                "volante -- 5\n" +
                "lateral esquerdo -- 6\n" +
                "atacante -- 9\n" +
                "meia --10\n");
    }
    private void inapto(){
        System.out.print("o jogador está apto pra jogar?\n" +
                "sim -- 1\n não -- 2\n");
    }
}
