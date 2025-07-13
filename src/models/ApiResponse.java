package models;

public class ApiResponse {
    private final double valorConvertido;

    public ApiResponse(double valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }
}
