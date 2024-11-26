package Exercicios;

import java.util.*;

public class Ex55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt(); // Lê o número

        int multiplicador = 1;

        System.out.println("Tabuada de " + numero + ":");

        do {
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        } while (multiplicador <= 10);

    }
}

