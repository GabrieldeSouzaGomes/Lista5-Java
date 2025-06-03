//Classificação de Triângulos: 
//Escreva um programa que solicite ao usuário os comprimentos dos
//três lados de umtriângulo eclassifique-o como equilátero, isósceles ou escaleno.

package lista05;

import java.util.Scanner;

public class ExercicioClassificacaoDeTriangulos02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado 3: ");
        double lado3 = scanner.nextDouble();

        // Verificar se os lados formam um triângulo válido
        if ( (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1) ) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo válido.");
        }

        scanner.close();
    }
}
