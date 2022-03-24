package tiss.casodeuso;

import patterns.facade.AtendimentoTissFacade;

import java.util.Scanner;

public class ExecuteFacade {
    protected  static  Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        var facade = new AtendimentoTissFacade();

        System.out.println("Atendimento online seja bem vindo \n");

        System.out.println("informe o tipo de atendimento que deseja. \n");

        facade.realizarAtentimento(scanner.next().toUpperCase(),"Joao");


    }

}
