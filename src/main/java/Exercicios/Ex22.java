package Exercicios;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        double salario, bonus;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        salario = entrada.nextDouble();

        if (salario > 2000) {
            bonus = salario * 0.10; // 10% de bônus
        } else {
            bonus = salario * 0.05; // 5% de bônus
        }

        System.out.println("O valor do bônus é: R$ " + bonus);

    }
}
