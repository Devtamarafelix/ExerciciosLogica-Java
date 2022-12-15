package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da prestação: ");
		float valorP = sc.nextFloat();
		
		System.out.println("Digite a taxa: ");
		float taxa = sc.nextFloat();
		
		System.out.println("Digite o tempo que a prestação está atrasada: ");
		float tempo = sc.nextFloat();

		float prestação = valorP + (valorP*taxa/100)*tempo;
		
		System.out.println("O total a pagar da prestação é: "+prestação);

		sc.close();

	}

}
