package Exercicios;

import java.util.*;

public class Ex34 {
    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        idade = entrada.nextInt();

        if (idade >= 18 && idade <= 70) {
            System.out.println("O voto é obrigatório.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("Idade inválida para o voto.");
        }

    }
}
