package Exercicios;

import java.util.*;

public class Ex74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / 5;

        System.out.println("A média das idades das 5 pessoas é: " + mediaIdades);
    }
}

