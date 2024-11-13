package Exercicios;

import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;

        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite a primeira nota (0 a 10): ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota (0 a 10): ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota (0 a 10): ");
        nota3 = entrada.nextDouble();


        media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);


        System.out.println("Média ponderada do aluno: " + media);



        }
    }
