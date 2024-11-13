package Exercicios;

import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        int num1, num2, temp;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = entrada.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Após a troca:");
        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);

    }
}
