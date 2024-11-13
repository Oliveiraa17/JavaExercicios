package Exercicios;

import java.util.*;

public class Ex9 {
    public static void main(String[] args) {
        double depositoMensal, taxaJuros, montante, jurosMensal;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: ");
        depositoMensal = entrada.nextDouble();
        System.out.print("Digite a taxa de juros mensal (em %): ");
        taxaJuros = entrada.nextDouble() / 100;  // Converte para decimal

        montante = 0;

        for (int mes = 1; mes <= 12; mes++) {
            montante += depositoMensal;  // Adiciona o depósito mensal ao montante
            jurosMensal = montante * taxaJuros;  // Calcula os juros sobre o montante
            montante += jurosMensal;  // Adiciona os juros ao montante
        }

        System.out.println("Montante após 12 meses: R$ " + montante);

    }
}
