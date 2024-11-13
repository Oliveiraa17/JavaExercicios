package Exercicios;

import java.util.*;

public class Ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, menores = 0, maiores = 0;

        System.out.print("Digite o número de pessoas no grupo: ");
        int quantidade = entrada.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = entrada.nextInt();

            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
        }

        System.out.println("Quantidade de menores de idade: " + menores);
        System.out.println("Quantidade de maiores de idade: " + maiores);

        entrada.close();
    }
}
