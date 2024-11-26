package Exercicios;

import java.util.*;

public class Ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("Digite o nome da pessoa " + (count + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            somaIdades += idade;
            count++;

            System.out.println();
        }

        double mediaIdades = somaIdades / 5.0;
        System.out.println("A média das idades é: " + mediaIdades);

    }
}
