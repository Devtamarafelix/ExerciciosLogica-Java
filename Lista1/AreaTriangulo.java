package exercicios;

import java.util.Scanner;

public class AreaTriangulo {

public static void main(String []args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a base do triângulo: ");
		float base =sc.nextFloat();
		
		System.out.println("Digite a altura do triângulo: ");
		float altura = sc.nextFloat();
		
		float area = base*altura/2;
		
		System.out.println("A area do triângulo corresponde a: "+area);
		
		sc.close();
		
}
}
