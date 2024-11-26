package Exercicios;

import java.util.*;

public class Ex84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorPares = 0;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("A quantidade de números pares é: " + contadorPares);

    }
}

