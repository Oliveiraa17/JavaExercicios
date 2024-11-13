package Exercicios;

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();


        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

    }
}
