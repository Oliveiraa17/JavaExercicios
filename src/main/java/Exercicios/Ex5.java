package Exercicios;

import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        double preco, valorTotal;
        int quantidade;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        preco = entrada.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        quantidade = entrada.nextInt();

        if (quantidade > 10) {
            valorTotal = preco * quantidade * 0.90; // Aplica 10% de desconto
        } else {
            valorTotal = preco * quantidade; // Sem desconto
        }


        System.out.println("Valor total a ser pago: " + valorTotal);

    }
}
