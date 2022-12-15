package exercicios;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor das dimensões do circulo: ");
		double raio = sc.nextInt();
		
		double area = Math.PI*Math.pow(raio, 2);
		
		System.out.printf("A area do circulo corresponde a: "+area);
		
		
		sc.close();
		
	}
}
