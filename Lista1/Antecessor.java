package exercicios;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");

		int valor = sc.nextInt();

		int antecessor = valor - 1;

		System.out.println("O antecssor do valor inserido é: " + antecessor);

		sc.close();

	}
}
