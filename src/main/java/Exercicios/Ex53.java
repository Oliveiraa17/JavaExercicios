package Exercicios;

public class Ex53 {
    public static void main(String[] args) {
        int numero = 2;

        System.out.println("Números pares de 1 a 50:");

        do {
            System.out.println(numero);
            numero += 2;
        } while (numero <= 50);
    }
}