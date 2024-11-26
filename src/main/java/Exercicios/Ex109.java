package Exercicios;

import java.util.Scanner;

public class Ex109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        boolean isIdentidade = true;

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        isIdentidade = false;
                        break;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        isIdentidade = false;
                        break;
                    }
                }
            }
            if (!isIdentidade) {
                break;
            }
        }

        if (isIdentidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }

    }
}
