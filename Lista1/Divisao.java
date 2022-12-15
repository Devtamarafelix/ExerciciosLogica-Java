package exercicios;

import java.util.Scanner;

public class Divisao {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner (System.in);
		
	    float numero1;
		float numero2;
		float resultado;
		
		System.out.println("Digite um valor: ");
		numero1=sc.nextFloat();
		System.out.println("Digite o segundo valor: ");
		numero2=sc.nextFloat();
		resultado = numero1 / numero2;
		System.out.println("O resultado da divis�o dos valores correspomdem a: "+resultado);
				sc.close();
	}

}
