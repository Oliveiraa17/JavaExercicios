package Exercicios;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }

    }
}
