package Exercicios;

import java.util.*;

public class Ex39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int soma = 0;


        while (contador < 5) {
            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();
            soma += numero;
            contador++;
        }

        double media = soma / 5.0;

        System.out.println("A média dos números é: " + media);

    }
}
