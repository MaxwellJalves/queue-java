package br.com.stream.exercicio;

import java.util.*;

public class Atividade01 {

    /**
     * Dadas as seguintes informações de [Id e contato] , crie um dicionário
     * e ordene este dicionadio exibindo Nome id = nome contato.
     * */

    /*
    * HashMap Gera uma ordenação randomica
    * LinkedList  Ordena por ordem de inserção
    * treeMap organiza de acordo com as chaves.
    * set<>  -- TreeSet<>
    * */

    public static void main(String[] args) {

        Map<Integer , Contato> agenda = new HashMap<>();
        agenda.put(01,new Contato(50,"Maxwell"));
        agenda.put(02,new Contato(2,"Bia"));
        agenda.put(05,new Contato(12,"doze"));

        for(Object itemAgenda : agenda.entrySet()){
            System.out.println(itemAgenda);
        }

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Integer,Contato> itemAgenda : agenda.entrySet()){
            sb.append("Codigo : ").append(itemAgenda.getValue().getId())
             .append("\nnome: ").append(itemAgenda.getValue().getContato());
            System.out.println(sb.toString());
        }

        Set<Map.Entry<Integer,Contato>> agendaTwo = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getContato()));

        agendaTwo.forEach(System.out::println);


    }


    public static class Contato{
        private Integer id;
        private String contato;

        public Contato(Integer id, String contato){
            this.id = id;
            this.contato = contato;
        }
        public Integer getId() {
            return id;
        }

        public String getContato() {
            return contato;
        }

        @Override
        public String toString() {
            return "Contato{" +
                    "id=" + id +
                    ", contato='" + contato + '\'' +
                    '}';
        }
    }


}
