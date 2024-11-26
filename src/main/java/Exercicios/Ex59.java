package Exercicios;

import java.util.*;

public class Ex59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 1;
        String nome;
        int idade;

        do {
            System.out.print("Digite o nome da pessoa " + contador + ": ");
            nome = scanner.nextLine();
            System.out.print("Digite a idade de " + nome + ": ");
            idade = scanner.nextInt();
            scanner.nextLine();

            somaIdades += idade;
            contador++;
        } while (contador <= 5);


        double mediaIdades = (double) somaIdades / 5;

        System.out.println("A média das idades é: " + mediaIdades);

    }
}
