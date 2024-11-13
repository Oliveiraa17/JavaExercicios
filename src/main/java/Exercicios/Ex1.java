package Exercicios;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        int num1, num2;
        int soma, subtracao, multiplicacao;
        double divisao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        num2 = entrada.nextInt();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        if(num2 !=0) {
            divisao = (double) num1 / num2;
        }else {
            divisao = 0;
            System.out.println("Divisão por zero não permitida.");
        }
            System.out.println("Soma: " + soma);
            System.out.println("Subtracao: " + subtracao);
            System.out.println("Multiplicacao: " + multiplicacao);
            if(num2 != 0){
                System.out.println("Divisão" + divisao);
            }
    }
}
