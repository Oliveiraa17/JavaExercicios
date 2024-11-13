package Exercicios;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        idade = entrada.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Adulto");
        } else if (idade >= 65) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade inválida.");
        }

    }
}
