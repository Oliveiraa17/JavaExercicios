package Exercicios;

import java.util.Scanner;

public class Ex105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4]; // Array para armazenar a soma de cada coluna

        System.out.println("Digite os valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nSoma dos elementos de cada coluna:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }

    }
}

