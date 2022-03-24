package br.com.stream;

import br.com.stream.model.Clients;
import br.com.stream.model.Shopping;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RunFirstTest {

    public static void main(String[] args) {

        List<Shopping> registerSales = new LinkedList<>();
        registerSales.add(new Shopping(1, new Clients("Maxwell", 32, true)));
        registerSales.add(new Shopping(2, new Clients("Bia", 32, true)));
        registerSales.add(new Shopping(3, new Clients("francisca", 32, false)));
        registerSales.add(new Shopping(4, new Clients("Clotiude", 32, true)));

//        System.out.println("Debug first Forms..\n\n");
//        registerSales.forEach(System.out::println);

        List<Shopping> newList = Arrays.asList(
                new Shopping(1000, new Clients("Gabriel", 1, false)),
                new Shopping(1002, new Clients("Joao", 12, false)),
                new Shopping(1003, new Clients("Guilherme", 12, false))
        );
//
//        System.out.println("Debug Segunda forma: \n");

//        newList.forEach(System.out::println);

        registerSales.addAll(newList);
//        System.out.println("Total de Registros : " + registerSales.stream().count());


        registerSales.stream()
                .filter( item -> item.getClients().getVip())
                .map(value -> value.getClients().getNome())
                .collect(Collectors.toList())

                .forEach(System.out::println);


    }
}
