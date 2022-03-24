package Teste;

public enum TiposDeCursos {
    ADM("Administração"),
    ODONTOLOGIA("Odonto"),
    ADS("Analise e desenvolvimento de sistemas");

    private final String value;

    TiposDeCursos(String value) {
        this.value = value;
    }

    public String getValue(){
       return  this.value;
    }
}
