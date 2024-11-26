package Exercicios;

import java.util.*;

public class Ex83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite 7 números inteiros:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 7;

        System.out.println("A média aritmética dos números é: " + media);
    }
}

