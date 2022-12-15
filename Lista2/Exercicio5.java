package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus celcius: ");
		float celcius = sc.nextFloat();

		float F = (9*celcius + 160)/5;
		System.out.println("A temperatura em Fahrenheit é: " + F);

		sc.close();

	}

}
