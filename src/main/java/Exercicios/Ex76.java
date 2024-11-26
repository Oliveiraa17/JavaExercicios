package Exercicios;

import java.util.*;

public class Ex76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int somaPares = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            }
        }

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + somaPares);

    }
}

