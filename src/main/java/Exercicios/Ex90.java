package Exercicios;

import java.util.*;

public class Ex90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean encontrouZero = false; // Variável para verificar se algum número é zero

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                encontrouZero = true;
                break;
            }
        }
        if (encontrouZero) {
            System.out.println("Pelo menos um dos números é igual a zero.");
        } else {
            System.out.println("Nenhum dos números é igual a zero.");
        }

    }
}
