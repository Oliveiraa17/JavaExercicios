package Exercicios;

import java.util.*;

public class Ex58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = scanner.nextInt();

        // Verifica se o número é válido
        if (limite <= 0) {
            System.out.println("Por favor, insira um número inteiro maior que 0.");
        } else {
            int a = 0, b = 1;
            System.out.println("Sequência de Fibonacci até " + limite + ":");

            do {
                if (a <= limite) {
                    System.out.print(a + " ");
                }
                int temp = a;
                a = b;
                b = temp + b;
            } while (a <= limite);

        }
    }
}
