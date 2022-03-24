package Teste;

public class Pessoa extends BaseEntity {

    private String nome;
    private Curso curso;

    public Pessoa(Integer id, String nome, Curso curso) {
        super(id);
        this.curso = curso;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Pessoa{ código : " + getId()+
                "\t nome='" +this.getNome() + '\'' +
                ", curso=" + this.getCurso() +
                '}';
    }
}
