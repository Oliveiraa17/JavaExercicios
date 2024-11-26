package Exercicios;

import java.util.Scanner;

public class Ex104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        boolean ehSimetrica = true;

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    ehSimetrica = false;
                    break;
                }
            }
            if (!ehSimetrica) break;
        }

        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        if (ehSimetrica) {
            System.out.println("\nA matriz é simétrica.");
        } else {
            System.out.println("\nA matriz não é simétrica.");
        }

    }
}

