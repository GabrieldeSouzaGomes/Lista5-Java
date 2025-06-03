//Cálculo de IMC: 
//Escreva um programa que solicite ao usuário seu peso e altura, 
//calcule o Índice de Massa Corporal (IMC) e classifique-o de acordo com a tabela de IMC.
package lista05;

import java.util.Scanner;

public class ExercicioCalculoDoIMC03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de peso
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        // Entrada de altura
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Exibe o IMC com duas casas decimais
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        scanner.close();
    }
}
