package Exercicios;

import java.util.*;

public class Ex54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int count = 0;
        int numero;

        do {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();
            soma += numero;
            count++;
        } while (count < 5);

        double media = (double) soma / count;

        System.out.println("A média aritmética dos números lidos é: " + media);

    }
}
