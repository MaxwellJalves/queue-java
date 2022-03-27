package br.com.stream.exercicio;

public enum Relevancia {
    BAIXA("Baixa"),MEDIA("Media"),ALTA("Alta");

    private final String value;

    Relevancia(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
