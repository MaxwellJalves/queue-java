package br.com.stream.exercicio.atividade05interface;

import java.util.ArrayList;
import java.util.List;

public class Atividade09 {
    public static void main(String[] args) {
        List<Number> referencias = new ArrayList(); //AQUI
        referencias.add(Double.valueOf(30.9));
        referencias.add(Integer.valueOf(10));
        referencias.add(Float.valueOf(13.4f));

        referencias.forEach(System.out::println);
        //Todo a lista pode ser do tipo Number ou Object para ficar de forma Generica
        /**
        - para cada primitivo existe uma classe chamada Wrapper
        - para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor
        - a criação do objeto Wrapper é chamada de autoboxing
        - a retirada do valor primitivo do objeto Wrapper é chamada de unboxing
        - autoboxing e unboxing acontecem automaticamente.
        - as classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing
         todas as classes wrappers que representam um valor numérico possuem a classe java.lang.Number como mãe **/
    }
}
