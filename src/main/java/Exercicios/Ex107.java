package Exercicios;

import java.util.Scanner;

public class Ex107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int produtoDiagonalSecundaria = 1;

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            produtoDiagonalSecundaria *= matriz[i][2 - i];
        }

        System.out.println("\nO produto dos elementos da diagonal secundária é: " + produtoDiagonalSecundaria);

    }
}

