package main;

import models.ConsultaMoedas;
import models.DuplaDeMoedas;
import models.ApiResponse;
import models.ListaMoedas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaMoedas lista = new ListaMoedas();
        ConsultaMoedas consulta = new ConsultaMoedas();

        System.out.println("===== CONVERSOR DE MOEDAS =====");
        lista.mostrarOpcoes();

        System.out.print("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();

        DuplaDeMoedas dupla = lista.getDupla(opcao);
        if (dupla == null) {
            System.out.println("Opção inválida. Encerrando.");
            return;
        }

        System.out.print("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        ApiResponse resultado = consulta.converter(dupla, valor);

        System.out.printf("Resultado da conversão %s → %s: %.2f → %.2f%n",
                dupla.getMoedaBase(), dupla.getMoedaDestino(),
                valor, resultado.getValorConvertido());

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
