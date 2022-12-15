package exercicios;

import java.util.Scanner;

public class AreaTrapezio {

	public static void main(String []args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a base maior de um trapézio: ");
		float bmaior =sc.nextFloat();
		
		System.out.println("Digite a base menor de um trapézio: ");
		float bmenor =sc.nextFloat();
		
		System.out.println("Digite a altura de um trapézio: ");
		float altura = sc.nextFloat();
		
		float area = (bmaior+bmenor)*altura/2;
		
		System.out.println("A area do trapézio é: "+area);
		
		sc.close();
		
}
}
