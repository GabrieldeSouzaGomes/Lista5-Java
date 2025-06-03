//Cálculo de Média e Classificação: 
//Escreva um programa que solicite ao usuário três notas,
//calcule a média e exiba a classificação (Aprovado, Recuperação, Reprovado).
package lista05;

import java.util.Scanner;

public class ExercicioCalculoDeMediaEClassificacao05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe a média formatada com 2 casas decimais
        System.out.printf("Média: %.2f\n", media);

        // Classificação segundo a média
        if (media >= 7.0) {
            System.out.println("Classificação: Aprovado");
        } else if (media >= 4.0) {
            System.out.println("Classificação: Recuperação");
        } else {
            System.out.println("Classificação: Reprovado");
        }

        scanner.close();
    }
}

