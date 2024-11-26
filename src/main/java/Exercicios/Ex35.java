package Exercicios;

import java.util.*;

public class Ex35 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        double media;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = entrada.nextInt();

        media = (numero1 + numero2 + numero3) / 3.0;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }

}
