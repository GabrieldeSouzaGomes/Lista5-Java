//Verificação de Ano Bissexto: 
//Escreva um programa que solicite ao usuário um ano e verifique se ele é bissexto.

package lista05;

import java.util.Scanner;

public class ExercicioVerificacaoDeAnoBissexto04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean bissexto;

        // Ano bissexto: divisível por 400 ou (divisível por 4 e não divisível por 100)
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            bissexto = true;
        } else {
            bissexto = false;
        }

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }
}

