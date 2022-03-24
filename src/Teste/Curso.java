package Teste;

import java.time.LocalDateTime;

public class Curso extends BaseEntity {

    private String nome;
    private LocalDateTime inicio;


    public  Curso (Integer id, TiposDeCursos nome){
        super(id);
        this.nome = nome.getValue();
        this.inicio = LocalDateTime.now();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id = " + getId()+
                ", nome='" + nome + '\'' +
                ", inicio=" + inicio +
                '}';
    }
}
