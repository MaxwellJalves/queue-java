package br.com.stream.exercicio;

import br.com.stream.exercicio.atividade05interface.ContaImplements;

import java.util.List;
import java.util.Vector;

public class Atividade06 {
    public static void main(String[] args) {

        //Ao criar uma nova instancia de Vector podemos utilizar a interface List, Collection e vector pois todas são implementações de List;
        List<ContaImplements> contaImplements = new Vector<>();
        contaImplements.add(new ContaImplements("João", 1515, 5555, "99090-9090"));
        contaImplements.add(new ContaImplements("maria", 1212, 5555, "99090-9090"));
        contaImplements.add(new ContaImplements("jose", 1313, 5555, "99090-9090"));

        System.out.println(
                "Carregando registros ... \n"
        );
        contaImplements.forEach(System.out::println);
    }
}
