package exercicios;

import java.util.Scanner;

public class AreaLosango {
	
	public static void main(String []args) {

	Scanner sc = new Scanner (System.in);
	
	 System.out.println("Digite a diagonal maior do losango: ");
	 float dmaior = sc.nextFloat();
	 
	 System.out.println("Digite a diagonal menor do losango");
	 float dmenor = sc.nextFloat();
	 
	 float area = dmaior*dmenor/2;
	 
	 System.out.println("A area do losango corresponde a: "+area);
	
	 sc.close();
	 
	
}
}
