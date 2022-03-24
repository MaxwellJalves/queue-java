package br.com.stream.model;

public class Clients {

    private final String nome;
    private final Integer idade;
    private final boolean vip;


    public Clients(String nome, Integer idade,boolean vip){
        this.nome = nome;
        this.idade = idade;
        this.vip = vip;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public boolean getVip(){
        return  this.vip;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", E Vipo =" + this.getVip()+
                '}';
    }
}
