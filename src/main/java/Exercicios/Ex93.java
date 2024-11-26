package Exercicios;

import java.util.*;

public class Ex93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 50) {
                contador++;
            }
        }

        System.out.println("A quantidade de números no intervalo de 10 a 50 é: " + contador);

    }
}

