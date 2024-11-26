package Exercicios;

import java.util.*;

public class Ex56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            int divisor = 1;

            System.out.println("Divisores de " + numero + ":");

            do {
                if (numero % divisor == 0) {
                    System.out.println(divisor);
                }
                divisor++;
            } while (divisor <= numero);
        }

    }
}

