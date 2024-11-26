package Exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Ex86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente são:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

    }
}
