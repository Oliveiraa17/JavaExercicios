package Exercicios;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        int idade;
        char sexo;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite o seu sexo (M para masculino, F para feminino): ");
        sexo = entrada.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            if (idade >= 65) {
                System.out.println("Você pode se aposentar.");
            } else {
                System.out.println("Você não pode se aposentar ainda.");
            }
        } else if (sexo == 'F') {
            if (idade >= 60) {
                System.out.println("Você pode se aposentar.");
            } else {
                System.out.println("Você não pode se aposentar ainda.");
            }
        } else {
            System.out.println("Sexo inválido! Por favor, insira 'M' para masculino ou 'F' para feminino.");
        }

    }
}
