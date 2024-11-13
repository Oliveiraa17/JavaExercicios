package Exercicios;

import java.util.*;

public class Ex26 {
    public static void main(String[] args) {
        int codigoProduto, quantidade;
        double preco, total;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        codigoProduto = entrada.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        quantidade = entrada.nextInt();

        switch (codigoProduto) {
            case 1:
                preco = 10.50; // Preço do produto 1
                break;
            case 2:
                preco = 20.75; // Preço do produto 2
                break;
            case 3:
                preco = 15.30; // Preço do produto 3
                break;
            case 4:
                preco = 7.90;  // Preço do produto 4
                break;
            case 5:
                preco = 50.00; // Preço do produto 5
                break;
            default:
                preco = 0.0;
                System.out.println("Código de produto inválido!");
                entrada.close();
                return;
        }

        total = preco * quantidade;

        System.out.println("Valor total a ser pago: R$ " + total);

    }
}
