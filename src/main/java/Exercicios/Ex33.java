package Exercicios;

import java.util.*;

public class Ex33 {
    public static void main(String[] args) {
        String nome, saudacao;
        char turno;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = entrada.nextLine();

        System.out.print("Digite o turno (M para matutino e V para vespertino): ");
        turno = entrada.next().charAt(0);

        if (turno == 'M' || turno == 'm') {
            saudacao = "Bom dia, " + nome;
        } else if (turno == 'V' || turno == 'v') {
            saudacao = "Boa tarde, " + nome;
        } else {
            saudacao = "Turno inválido!";
        }

        System.out.println(saudacao);

    }
}
