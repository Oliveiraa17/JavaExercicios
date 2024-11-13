package Exercicios;

import java.util.*;

public class Ex12 {
    public static void main(String[] args) {
        double peso, altura, imc;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        peso = entrada.nextDouble();
        System.out.print("Digite a altura (em metros): ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("O seu Índice de Massa Corporal (IMC) é: " + imc);

    }
}
