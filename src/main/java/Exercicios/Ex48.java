package Exercicios;

import java.util.*;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Os dígitos do número " + numero + " são:");

        while (numero > 0) {
            int digito = numero % 10;
            System.out.println(digito);
            numero /= 10;
        }

    }
}

