package exercicios;

import java.util.Scanner;

public class AreaTrapezio {

	public static void main(String []args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a base maior de um trap�zio: ");
		float bmaior =sc.nextFloat();
		
		System.out.println("Digite a base menor de um trap�zio: ");
		float bmenor =sc.nextFloat();
		
		System.out.println("Digite a altura de um trap�zio: ");
		float altura = sc.nextFloat();
		
		float area = (bmaior+bmenor)*altura/2;
		
		System.out.println("A area do trap�zio �: "+area);
		
		sc.close();
		
}
}
