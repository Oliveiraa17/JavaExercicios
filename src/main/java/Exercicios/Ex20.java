package Exercicios;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

    }
}
