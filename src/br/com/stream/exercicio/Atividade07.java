package br.com.stream.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Atividade07 {
    public static void main(String[] args) {
        int[] numeros = new int[]{10, 20, 30, 50, 45}; // Array de primitivos


        for (int num : numeros) {
            System.out.println("números : " + num);
        }

        //Em List só existe coleções de referencias

        List numerosList = new ArrayList();
        // o código não deveria compilar pois a lista guarda referencias e um tipo primitivo é != porém por baixo dos panos o java criar um objeto Integer passando o valor que fica uma referencia.

        numerosList.add(numeros[0]);

        //Validação caso eu tente passar um primitivo como referencia de List retorna um erro informando que o tipo é um primitivo.
        //List<int> primitivo = new ArrayList<>(); //

        List<Integer> permiteAutilizacaoComInteger = new ArrayList<>();
        permiteAutilizacaoComInteger.add(10); //TODO  Autoboxing Transformação do primitivo para Object , processo ocorre de forma automatica.

        System.out.println(numerosList);

        System.out.println(Integer.MAX_VALUE);
        System.out.println("O Integer possue " + Integer.BYTES + "Bytes");

        //Java docs Integer
    }
}
