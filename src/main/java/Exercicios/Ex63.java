package Exercicios;

import java.util.*;

public class Ex63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            numero = Math.abs(numero);
        }

        System.out.print("Os dígitos do número são: ");

        do {
            int digito = numero % 10;
            System.out.print(digito + " ");
            numero /= 10;
        } while (numero > 0);

        System.out.println();

    }
}
