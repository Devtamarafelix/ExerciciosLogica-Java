package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		

		int auxiliar = valor1;
		 valor1 = valor2;
		 valor2 = valor1;
		 valor2 = auxiliar;
		
		System.out.println("O primeiro valor corresponde a:  "+valor1);
		
		System.out.println("O segundo valor corresponde a:  "+valor2);

		sc.close();


	}

}
