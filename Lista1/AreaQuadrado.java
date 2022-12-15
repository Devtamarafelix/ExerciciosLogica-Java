package exercicios;

import java.util.Scanner;

public class AreaQuadrado {
	
	public static void main(String []args) {
	
		Scanner sc = new Scanner(System.in);
		
		double lado;
		double area;
		
		System.out.println("Insira o valor dos lados do quadrado: ");
		lado = sc.nextFloat();
		
		area = Math.pow(lado,2);
		
		System.out.println("A area di quadrado é: "+area);
		
		sc.close();
	}
			
}
