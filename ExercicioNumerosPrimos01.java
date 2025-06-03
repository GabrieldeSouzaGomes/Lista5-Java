//Verificação de Número Primo: 
//Escreva um programa que solicite ao usuário um número inteiro e verifique se ele é um número primo.

package lista05;

import java.util.Scanner;

public class ExercicioNumerosPrimos01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean isPrimo = true;

            // Verifica se o número tem algum divisor além de 1 e ele mesmo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }

        scanner.close();
    }
}
