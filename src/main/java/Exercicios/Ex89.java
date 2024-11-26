package Exercicios;

import java.util.*;

public class Ex89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorPositivos = 0;
        int contadorNegativos = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            }
        }

        System.out.println("A quantidade de números positivos é: " + contadorPositivos);
        System.out.println("A quantidade de números negativos é: " + contadorNegativos);

    }
}
