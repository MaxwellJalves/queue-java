package br.com.stream.model;


public class Shopping {

    private Integer codigoDaCompra;
    private Clients clients;

    public Shopping(Integer codigo, Clients clients){
        this.codigoDaCompra = codigo;
        this.clients = clients;
    }


    public Clients getClients() {
        return clients;
    }

    public Integer getCodigoDaCompra() {
        return codigoDaCompra;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "codigoDaCompra=" + codigoDaCompra +
                ", clients=" + clients +
                '}';
    }
}
