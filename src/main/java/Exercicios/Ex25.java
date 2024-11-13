package Exercicios;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        int faltas;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de faltas do aluno: ");
        faltas = entrada.nextInt();

        if (faltas > 15) {
            System.out.println("Aluno reprovado por falta.");
        } else {
            System.out.println("Aluno aprovado.");
        }

    }
}
