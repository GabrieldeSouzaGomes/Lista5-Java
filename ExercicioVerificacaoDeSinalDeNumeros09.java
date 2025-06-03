//Verificação de Sinal de Número: 
//Escreva um programa que solicite ao usuário um número e verifique se ele é positivo, negativo ou zero.

package lista05;

import java.util.Scanner;

public class ExercicioVerificacaoDeSinalDeNumeros09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        scanner.close();
    }
}

