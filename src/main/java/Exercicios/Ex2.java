package Exercicios;

import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
        double raio;
        double area, perimetro;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        raio = entrada.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        perimetro = 2 * Math.PI * raio;

        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo: " + perimetro);


        }
    }
