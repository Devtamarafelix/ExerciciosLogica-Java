package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o total de eleitores no município: ");
		float eleitores = sc.nextFloat();
		
		System.out.println("Qual o total de votos brancos: ");
		float brancos = sc.nextFloat();
		
		System.out.println("Qual o total de votos nulos: ");
		float nulos = sc.nextFloat();
		
		System.out.println("Qual o total de votos validos: ");
		float validos = sc.nextFloat();

		

		float percbrancos = brancos/eleitores*100;
		float percnulos = nulos/eleitores*100;
		float percvalidos = validos/eleitores*100;

		System.out.println("O percentual de votos brancos é: " + percbrancos);
		
		System.out.println("O percentual de votos nulos é: " + percnulos);
		
		System.out.println("O percentual de votos validos é: " + percvalidos);
		

		sc.close();

	}

	}

