package Exercicios;

import java.util.*;

public class Ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int somaIdades = 0;
        int count = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            somaIdades += idade;
            count++;

            System.out.println();
        }

        if (count > 0) {
            double mediaIdades = (double) somaIdades / count;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi registrada.");
        }

    }
}
