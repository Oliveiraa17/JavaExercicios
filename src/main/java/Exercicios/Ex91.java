package Exercicios;

import java.util.Scanner;

public class Ex91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPositivos = 0;
        int somaNegativos = 0;

        // Lê 10 números inteiros
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                somaNegativos += numero;
            }
        }

        System.out.println("A soma dos números positivos é: " + somaPositivos);
        System.out.println("A soma dos números negativos é: " + somaNegativos);

    }
}

