package Exercicios;

import java.util.*;

public class Ex64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            int fatorial = 1;
            int i = numero;

            do {
                fatorial *= i;
                i--;
            } while (i > 0);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

    }
}
