package enums;

public enum TiposDeGuiaTiss {
   GC("Guia de Consulta"),
   GSP("Guia de Serviço Profissional"),
   GRI("Guia de Resumo de Internação"),
   GHI_TISS("Guia de Honorário Individual no padrão TISS"),
   GOD("Guia de Outras Despesas"),
   GA_TISS("Guia Associada");

    private  String value;

    TiposDeGuiaTiss(String tipo){
        this.value = tipo;
    }

    public String getValue() {
        return value;
    }
}
