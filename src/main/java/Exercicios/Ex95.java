package Exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Ex95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        Arrays.sort(nomes);
        System.out.println("\nOs nomes em ordem alfabética são:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}

