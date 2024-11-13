package Exercicios;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}

