package Exercicios;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        String nome;
        double nota;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = entrada.nextLine();

        System.out.print("Digite a nota do aluno: ");
        nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.println(nome + " está aprovado!");
        } else {
            System.out.println(nome + " está em recuperação.");
        }

    }
}
