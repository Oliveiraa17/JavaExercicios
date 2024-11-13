package Exercicios;

import java.util.*;

public class Ex13 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " é múltiplo de " + num2);
        } else {
            System.out.println(num1 + " não é múltiplo de " + num2);
        }

    }
}
