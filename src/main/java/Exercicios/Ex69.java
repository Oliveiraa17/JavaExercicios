package Exercicios;

import java.util.*;

public class Ex69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 5;

        System.out.println("A média aritmética dos números é: " + media);

    }
}

