package br.com.stream.exercicio.atividade10.usecase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DatePtBr {
    public static void main(String[] args) {


        var formatacaoDataBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //TODO Formato pt-br default dia/mes/ano == 'dd/MM/yyyy'
        System.out.println("1) "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //TODO Exibindo os dados utilizando a timezone America/SP
        var dataAtual = LocalDateTime.of(LocalDate.now(),
                LocalTime.now(ZoneId.of("America/Sao_Paulo")));

        System.out.println("2) "+dataAtual.format(formatacaoDataBr));

        System.out.println("3) ZONA ID default pc : "+ZoneId.systemDefault());
    }
}
