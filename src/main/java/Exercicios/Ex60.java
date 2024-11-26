package Exercicios;

public class Ex60 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int contador = 1;

        System.out.println("Primeiros 20 números da sequência de Fibonacci:");

        do {
            System.out.print(a + " "); // Exibe o número da sequência

            int temp = a;
            a = b;
            b = temp + b;

            contador++;
        } while (contador <= 20);

        System.out.println();
    }
}

