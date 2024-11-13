package Exercicios;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = entrada.nextInt();

        int menor, meio, maior;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }

        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);

    }
}
