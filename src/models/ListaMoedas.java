package models;

import java.util.HashMap;
import java.util.Map;

public class ListaMoedas {
    private Map<Integer, DuplaDeMoedas> opcoes = new HashMap<>();

    public ListaMoedas() {
        opcoes.put(1, new DuplaDeMoedas("USD", "BRL"));
        opcoes.put(2, new DuplaDeMoedas("EUR", "BRL"));
        opcoes.put(3, new DuplaDeMoedas("GBP", "BRL"));
        opcoes.put(4, new DuplaDeMoedas("BRL", "USD"));
        opcoes.put(5, new DuplaDeMoedas("BRL", "EUR"));
        opcoes.put(6, new DuplaDeMoedas("BRL", "GBP"));
    }

    public DuplaDeMoedas getDupla(int opcao) {
        return opcoes.get(opcao);
    }

    public void mostrarOpcoes() {
        System.out.println("Escolha uma conversão:");
        System.out.println("1 - Dólar → Real");
        System.out.println("2 - Euro → Real");
        System.out.println("3 - Libra → Real");
        System.out.println("4 - Real → Dólar");
        System.out.println("5 - Real → Euro");
        System.out.println("6 - Real → Libra");
    }
}
