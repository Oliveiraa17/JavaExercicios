package Exercicios;

import java.util.Scanner;

public class Ex94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 7 números inteiros:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }
        }
    }
}

