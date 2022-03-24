package model;

public class Pessoa {

    private String nome;
    private Integer idade;

    public Pessoa(String nome,Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {

    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
