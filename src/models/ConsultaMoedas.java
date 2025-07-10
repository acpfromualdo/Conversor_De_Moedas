package models;

public class ConsultaMoedas {
    public ApiResponse converter(DuplaDeMoedas dupla, double valor) {
        double taxa = getTaxa(dupla.getCodigo());
        double convertido = valor * taxa;
        return new ApiResponse(convertido);
    }

    private double getTaxa(String codigo) {
        return switch (codigo) {
            case "USD-BRL" -> 5.40;
            case "EUR-BRL" -> 6.20;
            case "GBP-BRL" -> 7.10;
            case "BRL-USD" -> 1 / 5.40;
            case "BRL-EUR" -> 1 / 6.20;
            case "BRL-GBP" -> 1 / 7.10;
            default -> 1;
        };
    }
}
