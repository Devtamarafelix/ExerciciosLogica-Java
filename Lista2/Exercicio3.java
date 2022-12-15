package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário atual: ");
		float sm = sc.nextFloat();
		
		System.out.println("Digite o percentual do reajuste: ");
		float percentual = sc.nextFloat();

		float NovoSalario = sm * percentual/100 + sm;
		
		System.out.println("O no salário do funcionário é: R$"+NovoSalario);
		
		sc.close();
	}

}
