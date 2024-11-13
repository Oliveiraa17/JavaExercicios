package Exercicios;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

    }
}

