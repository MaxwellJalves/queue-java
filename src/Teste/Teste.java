package Teste;

import enums.EstadoAtividade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {

    public static void main(String[] args) {


        Map<EstadoAtividade, List<String>> validacao = new HashMap<>();

        List<String> aulasAbertas = new ArrayList<>();
        List<String> aulasFechadas = new ArrayList<>();

        aulasAbertas.add("Portugues");
        aulasAbertas.add("Matematica");

        aulasFechadas.add("Ingles");
        aulasFechadas.add("Development");

        validacao.put(EstadoAtividade.ABERTO,aulasAbertas);
        validacao.put(EstadoAtividade.FECHADO,aulasFechadas);


        System.out.println(validacao);



    }
}
