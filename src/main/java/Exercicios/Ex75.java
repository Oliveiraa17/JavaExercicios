package Exercicios;

public class Ex75 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.println("Primeiros 20 números da sequência de Fibonacci:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
