package br.com.stream.exercicio;

import java.util.Arrays;
import java.util.List;

public class Atividade03 {
    public static void main(String[] args) {

        List<Integer> valores = Arrays.asList(10, 12, 5, 12, 10, 3, 5, 1, 2, 1, 0);
        //TODO Aleatorio
        printTheFiveFirstNumbers(valores);
        //TODO Ordenation
        printTheFiveFirstNumbersOrdenation(valores);
        //TODO Distinct
        printTheFiveFirstNumberDistinct(valores);
        //TODO Min
        getMinValueList(valores);
        //TODO Max
        getMaxValueList(valores);


    }

    private static void printTheFiveFirstNumbers(List<Integer> value) {
        System.out.println("-- distinct Int Compare--");
        value.stream()
                .limit(5)
                .forEach(System.out::println);
    }

    private static void printTheFiveFirstNumbersOrdenation(List<Integer> value) {
        System.out.println("-- Ordenado do  menor para o maior--");

        value.stream()
                .sorted()
                .limit(5)
                .forEach(System.out::println);
    }

    private static void printTheFiveFirstNumberDistinct(List<Integer> value) {
        System.out.println("-- ordenado e exibindo apenas os números que não são iguais --");
        value.stream()
                .sorted()
                .distinct()
                .limit(5)
                .forEach(System.out::println);
    }

    private static void getMinValueList(List<Integer> value) {
        System.out.println("-- Retorna o menor valor da lista --");
        var menorValor = value.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.printf("Meno valor localizado : %s \n", menorValor);

    }

    private static void getMaxValueList(List<Integer> value) {
        System.out.println("-- Retorna o maior valor da lista --");
        var maiorValor = value.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.printf("Maior valor localizado : %s", maiorValor);

    }
}
