package Exercicios;

import java.util.*;

public class Ex73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            int a = 0, b = 1;

            System.out.println("Sequência de Fibonacci até " + numero + ":");

            while (a <= numero) {
                System.out.print(a + " ");
                int temp = a;
                a = b;
                b = temp + b;
            }
        }

    }
}

