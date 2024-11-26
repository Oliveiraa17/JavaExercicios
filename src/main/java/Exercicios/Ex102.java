package Exercicios;

import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] produto = new int[2][2];

        System.out.println("Digite os valores da matriz A (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "] da matriz A: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDigite os valores da matriz B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "] da matriz B: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                produto[i][j] = 0; // Inicializa o valor do produto
                for (int k = 0; k < 2; k++) {
                    produto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Exibe as matrizes e o produto
        System.out.println("\nMatriz A:");
        exibirMatriz(matrizA);

        System.out.println("\nMatriz B:");
        exibirMatriz(matrizB);

        System.out.println("\nProduto das matrizes A e B:");
        exibirMatriz(produto);

    }

    // Método para exibir uma matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
