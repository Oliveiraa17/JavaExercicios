package Exercicios;

import java.util.*;

public class Ex41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int divisor = 1; // Inicia com 1
            System.out.println("Divisores de " + numero + ":");

            while (divisor <= numero) {
                if (numero % divisor == 0) {
                    System.out.println(divisor);
                }
                divisor++;
            }
        } else {
            System.out.println("O número deve ser inteiro e positivo.");
        }

    }
}
