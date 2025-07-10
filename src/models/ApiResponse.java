package models;

public class ApiResponse {
    private double valorConvertido;

    public ApiResponse(double valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }
}
