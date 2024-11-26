package Exercicios;

import java.util.*;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser não negativo.");
        } else {
            int fatorial = 1;
            int contador = numero;

            while (contador > 1) {
                fatorial *= contador;
                contador--;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

    }
}
