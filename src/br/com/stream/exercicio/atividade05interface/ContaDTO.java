package br.com.stream.exercicio.atividade05interface;

public class ContaDTO {

    private String nome;
    private Integer numeroDaConta;
    private Integer numeroDaAgencia;
    private String telefone;

    public  ContaDTO(String nome, Integer numeroConta, Integer numeroDaAgencia,String telefone){

        this.nome = nome;
        this.numeroDaAgencia = numeroDaAgencia;
        this.numeroDaConta = numeroConta;
        this.telefone = telefone;

    }
    public String getNome() {
        return nome;
    }

    public Integer getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTelefone(){
        return  telefone;
    }

    @Override
    public String toString() {
        return String.format("Beneficiario : %s , Nº Conta: %d  , Agencia : %d\nNúmero de contato: (081)  %s",getNome(),getNumeroDaConta(),getNumeroDaAgencia(),getTelefone());
    }
}
