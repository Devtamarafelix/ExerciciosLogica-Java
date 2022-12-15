package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do custo de fábrica: ");
		float custoFabrica = sc.nextFloat();

		float custoFinal = (float) (custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45));

		System.out.println("O custo final do consumidor é: R$" + custoFinal);

		sc.close();
	}

}
