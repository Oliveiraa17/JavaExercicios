package Exercicios;

import java.util.*;

public class Ex80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para terminar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            somaIdades += idade;
            contador++;
        }

        if (contador > 0) {
            double mediaIdades = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi registrada.");
        }

    }
}

