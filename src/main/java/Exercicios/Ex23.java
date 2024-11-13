package Exercicios;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        String mes;
        int dias;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do mês: ");
        mes = entrada.nextLine().toLowerCase();

        switch (mes) {
            case "janeiro", "março", "maio", "julho", "agosto", "outubro", "dezembro" -> dias = 31;
            case "abril", "junho", "setembro", "novembro" -> dias = 30;
            case "fevereiro" -> dias = 28; // Considerando anos não bissextos
            default -> {
                System.out.println("Mês inválido.");
                entrada.close();
                return;
            }
        }

        System.out.println("O mês de " + mes + " tem " + dias + " dias.");

    }
}
