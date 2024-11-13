package Exercicios;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        int quantidade;
        double precoUnitario, valorTotal;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        quantidade = entrada.nextInt();

        if (quantidade < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.40;
        }

        valorTotal = quantidade * precoUnitario;

        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);

    }
}
