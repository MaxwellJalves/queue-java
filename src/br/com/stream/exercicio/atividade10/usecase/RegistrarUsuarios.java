package br.com.stream.exercicio.atividade10.usecase;

import br.com.stream.exercicio.atividade10.Usuario;

import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class RegistrarUsuarios {
    //Todo ordenar por nome e data
    /**
     * Atividade pegar uma situação real , onde podemos receber um objeto com n propriedade e precisamos ordentar:
     * 1) Imprimir todos os dados
     * 2) Imprimir usuários ordenando por data de nascimentos
     * 3) Ordenar usuários por nome
     * */
    public static void main(String[] args) {


        List<Usuario> registroDeUsuarios = new ArrayList<>();
        registroDeUsuarios.add(new Usuario("Maxwell", LocalDate.of(1990, 03, 15)));
        registroDeUsuarios.add(new Usuario("Bruno", LocalDate.of(1993, 5, 05)));
        registroDeUsuarios.add(new Usuario("Arthur", LocalDate.of(2022, 2, 12)));
        registroDeUsuarios.add(new Usuario("Felipe", LocalDate.of(2022, 5, 05)));
        registroDeUsuarios.add(new Usuario("Grabriel", LocalDate.of(2010, 2, 20)));


        System.out.println("\n-----------------Exibir Registros---------------");
        registroDeUsuarios.forEach(System.out::println);

        System.out.println("\n-----------------Ordenando Usuarios por data de nascimento---------------");

        var filtro =registroDeUsuarios.stream().filter(i -> LocalDate.now().isAfter(i.getDataDeNascimento())).collect(Collectors.toList());


        System.out.println("\n-----------------Ordenando Usuarios por data de nascimento---------------");
        registroDeUsuarios.stream()
                .sorted((o1, o2) ->
                        ChronoLocalDate
                                .timeLineOrder()
                                .compare(o1.getDataDeNascimento(), o2.getDataDeNascimento())
                )
                .forEach(System.out::println);

        System.out.println("\n-----------------Ordenando por nome---------------");
        registroDeUsuarios.stream().sorted((o1,o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getNome(),o2.getNome())).forEach(System.out::println);





    }


}
class  CompareString implements Comparator<Usuario>{
    @Override
    public int compare(Usuario o1, Usuario o2) {

        return String.CASE_INSENSITIVE_ORDER.compare(o1.getNome(),o2.getNome());
    }
}