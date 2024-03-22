package Aula04;

import java.util.Scanner;
public class entradas_saidass {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String nome = scn.next();
		
		System.out.print("Digite um número do tipo inteiro");
		int num_int = scn.nextInt();
		
		System.out.print("Digite um número do tipo double:");
		double num_double= scn.nextDouble();
		
		System.out.println("Seu nome é:" + nome);
		System.out.println("O número inteiro é:" + num_int);
		System.out.print("O número real é:" + num_double);
	

	}

}
