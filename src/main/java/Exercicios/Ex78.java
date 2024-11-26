package Exercicios;

import java.util.*;

public class Ex78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        numero = Math.abs(numero);

        System.out.print("Os dígitos do número são: ");
        while (numero > 0) {
            int digito = numero % 10;
            System.out.print(digito + " ");

            numero = numero / 10;
        }

    }
}

