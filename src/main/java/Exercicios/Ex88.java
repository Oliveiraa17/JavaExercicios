package Exercicios;

import java.util.*;

public class Ex88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;

        // Lê 5 números inteiros
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
                contadorPares++;
            } else {
                somaImpares += numero;
                contadorImpares++;
            }
        }

        // Calcula e exibe as médias
        if (contadorPares > 0) {
            double mediaPares = (double) somaPares / contadorPares;
            System.out.println("A média dos números pares é: " + mediaPares);
        } else {
            System.out.println("Não foram digitados números pares.");
        }

        if (contadorImpares > 0) {
            double mediaImpares = (double) somaImpares / contadorImpares;
            System.out.println("A média dos números ímpares é: " + mediaImpares);
        } else {
            System.out.println("Não foram digitados números ímpares.");
        }

    }
}

