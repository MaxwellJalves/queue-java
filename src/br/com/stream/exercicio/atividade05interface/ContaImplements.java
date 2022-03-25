package br.com.stream.exercicio.atividade05interface;

public class ContaImplements extends ContaDTO implements Conta, Usuario {


    public ContaImplements(String nome, Integer numeroConta, Integer numeroDaAgencia, String telefone) {
        super(nome, numeroConta, numeroDaAgencia, telefone);
    }

    @Override
    public Integer getConta() {
        return super.getNumeroDaConta();
    }

    @Override
    public Integer getAgencia() {
        return super.getNumeroDaAgencia();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getTelefone() {
        return super.getTelefone();
    }


}
