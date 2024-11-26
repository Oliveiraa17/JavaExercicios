package Exercicios;

public class Ex37 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;


        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        // Exibe a soma total
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
