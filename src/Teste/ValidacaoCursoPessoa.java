package Teste;

import java.util.*;
import java.util.stream.Collectors;

public class ValidacaoCursoPessoa {
    public static void main(String[] args) {

        var ads = new Curso(10, TiposDeCursos.ADS);
        var adm = new Curso(11, TiposDeCursos.ADM);
        var odt = new Curso(12, TiposDeCursos.ODONTOLOGIA);


        Pessoa pessoa = new Pessoa(9999, "Gabriel", ads);

        var adalton = new Pessoa(1, "Adalton", adm);
        var rubens = new Pessoa(2, "Rubens", adm);
        var sophia = new Pessoa(3, "sophia", adm);

        var maxwell = new Pessoa(4, "Maxwell", odt);
        var bia = new Pessoa(5, "Bia", odt);

        List<Pessoa> alunos = new ArrayList<>();

        alunos.addAll(Arrays.asList(adalton, rubens, sophia, maxwell, bia));

        System.out.println("DEBUG ==" + TiposDeCursos.ADM.getValue());
        System.out.println("Acessando via referentcia ==" + alunos.get(1).getCurso().getNome());
        //alunos.forEach(System.out::println);

        Map<TiposDeCursos, Pessoa> alunosAdm = new HashMap<>();
        Map<TiposDeCursos, Pessoa> alnosOdonto = new HashMap<>();
        var retorno = alunos
                .stream()
                .filter(f -> f.getCurso().getNome() == TiposDeCursos.ADM.getValue())
                .map(n -> alunosAdm.put(TiposDeCursos.ADM,n))
                .collect(Collectors.toList());



        System.out.println("Administração" + alunosAdm);
        System.out.println("odonto" + alnosOdonto);
    }
}
