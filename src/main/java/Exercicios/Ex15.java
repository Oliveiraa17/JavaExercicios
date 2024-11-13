package Exercicios;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        double salario, novoSalario;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: R$ ");
        salario = entrada.nextDouble();

        novoSalario = salario * 1.15;

        System.out.println("O novo salário com aumento de 15% é: R$ " + novoSalario);

    }
}
