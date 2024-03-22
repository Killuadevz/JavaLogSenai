package exercicio_5;

import java.util.Scanner;


public class Letra_H {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);
        
		System.out.print("Digite o Comprimento:");
		double Comprimento = scn.nextDouble();
		
		System.out.print("Digite a Largura:");
		double Largura = scn.nextDouble();
	
		System.out.print("Digite a Altura:");
		double Altura = scn.nextDouble();
		
		double conta =  Comprimento * Largura * Altura;
		
		System.out.println("O Volume é:" + conta);
	}

}
