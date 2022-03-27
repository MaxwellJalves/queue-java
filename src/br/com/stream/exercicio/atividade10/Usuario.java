package br.com.stream.exercicio.atividade10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario {

    private  String nome;
    private LocalDate dataDeNascimento;

    public Usuario(String nome, LocalDate dataDeNascimento){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public  LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String toString(){
        return String.format("Nome : %s  Data_de_nascimento: %s",getNome(), getDataDeNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }


}
