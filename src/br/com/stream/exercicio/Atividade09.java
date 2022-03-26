package br.com.stream.exercicio;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Atividade09 {
    //TODO Ordenação de Data com LocalDate
    public static void main(String[] args) {

        List<LocalDate> datas = new ArrayList<>();
        datas.add(LocalDate.of(2022, 02, 03));
        datas.add(LocalDate.of(2022, 03, 28));
        datas.add(LocalDate.now());
        datas.add(LocalDate.of(2022, 01, 22));

      //  Convertendo Stream<LocalDate> em List<LocalDate
       var conversor = datas.stream()
             .sorted()
             .collect(Collectors.toList());
        System.out.println("{====Datas ordenadas=======}");
       conversor.forEach(System.out::println);

        System.out.println("{====Retorna todos os registros com a data atual=======}");

       conversor.stream()
               .filter( i -> LocalDate.now().equals(ChronoLocalDate.from(i)))
               .forEach(System.out::println);

        System.out.println("{======Retorna todas as datas anterior a data atual=========}");

        conversor.stream()
                .filter( i -> ChronoLocalDate.from(i).isBefore(LocalDate.now()))
                .forEach(System.out::println);

        System.out.println("{======Retorna todas as datas posterior data atual=========}");

        conversor.stream().filter( data -> ChronoLocalDate.from(data).isAfter(LocalDate.now())).forEach(System.out::println);

        var retornoFindAny =  conversor.stream().findAny().get();
        System.out.println("Retorno FindAny :" + retornoFindAny);
    }
}
