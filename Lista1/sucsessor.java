package exercicios;

import java.util.Scanner;

public class sucsessor {
	
	public static void main (String []args){

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite um valor: ");
	 
	 int valor = sc.nextInt();
	 
	 int sucessor = valor + 1;
	 
	 System.out.println("O sucessor do valor inserido é: "+sucessor);
	 
	 sc.close();

}
 }
