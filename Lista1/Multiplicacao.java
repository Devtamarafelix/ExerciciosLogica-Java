package exercicios;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		int resultado;

		System.out.println("Digite um valor: ");
		numero1 = sc.nextInt();
		System.out.println("Digite um segundo valor: ");
		numero2 = sc.nextInt();
		resultado = numero1 * numero2;
		System.out.println("O resultado dos valores correspondem a: " + resultado);
		sc.close();

	}
}
