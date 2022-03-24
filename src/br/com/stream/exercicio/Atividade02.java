package br.com.stream.exercicio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Atividade02 {

    public static void main(String[] args) {
        //Ordenção
        Logger log = Logger.getLogger("[[[Init]]]");
        List<Integer> numbers = Arrays.asList(10,25,02,5,23,50,1);

        // numbers.stream().forEach(System.out::println);
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        //Pegar os 5 primeiros números e imprimir
        System.out.println("imprimindo os 5 primeiros elementos.");


        //Adicionar os 5 elementos em um set

        System.out.println("imprimindo adicionando em um set [Set não aceita numeros repetidos]");

        numbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

//        numbers.forEach(System.out::println );

        //Transformando uma lista para uma lista de Números inteiros.

        var retorno = numbers.stream().map(Integer::new).collect(Collectors.toList());
        System.out.println(retorno);
    }


}
