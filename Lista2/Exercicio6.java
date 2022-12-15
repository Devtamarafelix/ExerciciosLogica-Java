package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em Fahrenheit: ");
		float F = sc.nextFloat();

		float C = (F-32) * 5/9;
		System.out.println("A temperatura em celcius é: " + C);

		sc.close();

	}

}
