package br.com.stream.praticacollections;

import model.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Logger;

public class ClasseAnonima {
    //Classe instanciada apenas uma vez.

    //sort recebe como argumento um comparator utilizando o metodo compare


    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>() {
            {
                add(new Pessoa("Aurorinha", 30));
                add(new Pessoa("Maxwell", 20));
                add(new Pessoa("Gabriel", 15));
                add(new Pessoa("Sophia", 12));
                add(new Pessoa("Aurorinha", 2));

            }
        };

        //class anonima
        pessoas.sort(new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().contains(o2.getNome()) ? 0 : -1;
            }
        });

        pessoas.forEach(System.out::println);

        pessoas.sort(Comparator.comparing(new Function<Pessoa, String>() {
            @Override
            public String apply(Pessoa pessoa) {
                return pessoa.getNome();
            }
        }));
        Logger log = Logger.getLogger("Init");
        log.info("Apos o comparing");
        log.info(pessoas.toString());
        System.out.println("End.");
        log.info("=================");
        pessoas.sort(Comparator.comparing(Pessoa::getIdade));

        log.info("Segundo Fluxo");
        pessoas.forEach(System.out::println);

        //() -> lamba expression - Simplifica uma classe anonima

        //Classe::getnome   Reference method - simplifica o lambda expression

        //TODO class anonima  - Reduz a implementação do código para uma nova criação de classe ou instanciação unica
        //Comparator.comparing
        //Comparator.compare


        //Stream api traz uma nova opção para a manipulação de coleções em java seguindo os princípios da programação funcionar. Combina com as expressões lambda.
        //ela proporciona uma forma diferente de lidar com conjuntos de elementos, oferencendo ao dese

        // Source -> pipeline - terminal
        // fonte ->  operação intermediaria - Operação final.
        // forma para facilitar a manipulação das collections.

        // uma stream recebe um lambda -> simplicando como classe anonima -> e conhecimento da interface funcional."Interface que segue o Single abstract method" SAM" @FunctionalInterface
        //Argumento -> corpo || Classe::method
    }
}
