package models;

public class DuplaDeMoedas {
    private final String moedaBase;
    private final String moedaDestino;

    public DuplaDeMoedas(String moedaBase, String moedaDestino) {
        this.moedaBase = moedaBase;
        this.moedaDestino = moedaDestino;
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public String getCodigo() {
        return moedaBase + "-" + moedaDestino;
    }
}
