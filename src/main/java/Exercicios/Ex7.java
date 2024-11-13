package Exercicios;

import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        double salarioBase, salarioLiquido, comissao;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        salarioBase = entrada.nextDouble();

        comissao = salarioBase * 0.05;

        salarioLiquido = salarioBase + comissao;

        System.out.println("Salário líquido do funcionário: " + salarioLiquido);


    }
}
