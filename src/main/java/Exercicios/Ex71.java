package Exercicios;

import java.util.*;

public class Ex71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Divisores de " + numero + ":");

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Por favor, insira um número inteiro positivo.");
        }

    }
}

