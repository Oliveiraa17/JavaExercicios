package Exercicios;

import java.util.*;

public class Ex43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int limite = scanner.nextInt();

        if (limite < 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            System.out.println("Sequência de Fibonacci até " + limite + ":");

            int anterior = 0;
            int atual = 1;

            while (anterior <= limite) {
                System.out.print(anterior + " ");

                int proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }

    }
}

