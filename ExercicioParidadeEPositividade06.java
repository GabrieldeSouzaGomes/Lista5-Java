//Cálculo de Média e Classificação: 
//Escreva um programa que solicite ao usuário três notas,
//calcule a média e exiba a classificação (Aprovado, Recuperação, Reprovado).

package lista05;

import java.util.Scanner;

public class ExercicioParidadeEPositividade06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Classificação: Aprovado");
        } else if (media >= 5.0) {
            System.out.println("Classificação: Recuperação");
        } else {
            System.out.println("Classificação: Reprovado");
        }

        scanner.close();
    }
}
