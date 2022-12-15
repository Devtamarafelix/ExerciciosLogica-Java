package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio da lata de oleo: ");
		float raio = sc.nextFloat();
		
		System.out.println("Digite a altura da lata de oleo: ");
		float altura = sc.nextFloat();

		float volume = (float) (Math.PI*Math.pow(raio, 2)*altura);
		
		System.out.println("O volume da lata de óleo corresponde a: " + volume);

		sc.close();

	}

}
