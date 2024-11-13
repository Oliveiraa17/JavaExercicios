package Exercicios;

import java.util.*;

public class Ex31 {
    public static void main(String[] args) {
        double salarioMinimo, salarioFuncionario, quantidadeSalarios;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do salário-mínimo: R$ ");
        salarioMinimo = entrada.nextDouble();

        System.out.print("Digite o salário do funcionário: R$ ");
        salarioFuncionario = entrada.nextDouble();

        quantidadeSalarios = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionário recebe %.2f salários-mínimos.\n", quantidadeSalarios);

    }
}
