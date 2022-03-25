package br.com.stream.exercicio;

public class Atividade08 {

    /**
     * (Primitivo)   -------->  Autoboxing
     * int       ========>  Java.lang.Integer
     * Unboxing     <--------    (Wrapper)
     * Motivo da existencia , permite o trabalhado com Collections
     */

    public static void main(String[] args) {
        //TODO Classe.MetodoEstatico(Primitivo int)
        Integer inteiroWrapper = Integer.valueOf(10);
        inteiroWrapper.intValue(); // retorna um primitivo
        System.out.println(inteiroWrapper.compareTo(10)); //Retorna 0 true ou -1 para false
        //TODO Wrappers são classes que contém funcionalidades e encapsulam a variável de tipo primitivo
        var inteiro = Integer.parseInt("10");//Convertendo String para o tipo primitivo ;
        System.out.println(inteiro);

        String dia = "29";
        int diaD = Integer.valueOf(dia);

        System.out.printf("Dia d %d",diaD);
        //TODO Bytes por tipos.
        /** Tipos primitivos e classes associadas
         * 8 bytes double <-----> Java.lang.Double
         * 4 bytes float  <-----> Java.lang.Float
         * 8 bytes long  <-----> Java.lang.Long
         * 4 bytes int  <-----> Java.lang.Integer
         * 2 bytes short  <-----> Java.lang.Short
         * 1 bytes byte  <-----> Java.lang.Byte
         * 2 bytes char  <-----> Java.lang.Character
         * boolean  <-----> Java.lang.Boolean
         * */

    }
}
