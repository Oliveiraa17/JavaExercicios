package Exercicios;

public class Ex45 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int count = 1;

        System.out.println("Primeiros 20 números da sequência de Fibonacci:");

        while (count <= 20) {
            System.out.print(n1 + " ");
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
            count++;
        }
    }
}
