package Exercicios;

import java.util.*;

public class Ex28 {
    public static void main(String[] args) {
        double peso, altura, imc;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu peso (kg): ");
        peso = entrada.nextDouble();

        System.out.print("Digite a sua altura (m): ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Classificação: Obesidade grau 2 (severa)");
        } else {
            System.out.println("Classificação: Obesidade grau 3 (mórbida)");
        }

    }
}
