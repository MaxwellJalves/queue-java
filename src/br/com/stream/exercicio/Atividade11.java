package br.com.stream.exercicio;

public class Atividade11 {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("Executando Linha de Executação Thread..\n"));

        System.out.println(Relevancia.ALTA.name());
        System.out.println(Relevancia.ALTA.getValue());
        //TODO ordem de declaração
        System.out.println(Relevancia.BAIXA.ordinal());
        System.out.println(Relevancia.MEDIA.ordinal());
        System.out.println(Relevancia.ALTA.ordinal());

        thread.setPriority(Relevancia.ALTA.ordinal());
        thread.start();

    }

}
