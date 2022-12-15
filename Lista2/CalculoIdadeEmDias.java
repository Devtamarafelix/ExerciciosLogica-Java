package exercicios;

import java.util.Scanner;

public class CalculoIdadeEmDias {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade em anos: ");
		int anos = sc.nextInt();

		System.out.println("Digite sua idade em meses: ");
		int meses = sc.nextInt();

		System.out.println("Digite sua idade em dias: ");
		int dias = sc.nextInt();

		float resultado = dias+(anos*360) + (meses*30);

		System.out.println("Sua idade em dias é: " + resultado);

		sc.close();

	}
}

