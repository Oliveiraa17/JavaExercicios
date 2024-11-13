package Exercicios;

import java.util.*;

public class Ex11 {
    public static void main(String[] args) {
        double num1, num2, num3, media;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextDouble();
        System.out.print("Digite o terceiro número: ");
        num3 = entrada.nextDouble();

        media = (num1 + num2 + num3) / 3;

        System.out.println("A média aritmética é: " + media);

    }
}
