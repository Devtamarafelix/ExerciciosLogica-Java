package exercicios;

import java.util.Scanner;

public class Exercicio8 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tenpo gasto da viagem: ");
		float tempo = sc.nextFloat();
		
		System.out.println("Digite a velocidade durante a viagem: ");
		float velocidade = sc.nextFloat();

		float distancia = velocidade*tempo;
		
		float litros = distancia/12;
		
		System.out.println("A distância percorrida na viagem foi: "+distancia);
		
		System.out.println("A quantidade de litros de combustivél gasta durante a viagem foi: "+litros);

		sc.close();

	}
}
