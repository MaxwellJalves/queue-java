package br.com.stream.exercicio;

import java.util.Vector;

public class Atividade04 {

    //TODO Thread Sade
    /*
    * O Vector é Threadsafe diferente do ArrayList
    * Vector utiliza Array
    * Vector é uma lista*/

    public static void main(String[] args) {
        //Crie um vector e insira 3 registros
        Vector<String> vetor = new Vector<>();
        vetor.add("Primeiro elemento");
        vetor.add("segundo elemento");
        vetor.add("Terceiro componente");
        //Imprima os dados
        vetor.forEach(System.out::println);
        //Exiba o tamanho do vetor
        System.out.printf("\n\nTamanho da lista : %d \n\n ------------------- \n",vetor.size());
        //Remova um objeto pelo nome
        vetor.remove("segundo elemento");
        //imprima os dados após a exclusão
        vetor.forEach(System.out::println);

    }
}
