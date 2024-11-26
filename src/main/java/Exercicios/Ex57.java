package Exercicios;

import java.util.*;

public class Ex57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            int divisor = 2;
            boolean isPrimo = true;

            do {
                if (numero % divisor == 0) {
                    isPrimo = false;
                    break;
                }
                divisor++;
            } while (divisor <= Math.sqrt(numero));

            if (isPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }

    }
}
