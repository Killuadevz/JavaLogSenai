package exercicio_5;

import java.util.Scanner;

public class parcelas {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite o Valor que você deseja:");
		double Valor = scn.nextDouble();
		
		System.out.print("Digite em quantas vezes você deseja fazer os pagamentos:");
		double Parcelas = scn.nextDouble();
		
		System.out.print("Digite a taxa:");
		double taxa = scn.nextDouble();
		
		double valordaprestacao = Valor + Valor * (1 + (taxa/100) * Parcelas);
		
		
		System.out.print("O Valor final é: " + valordaprestacao);
		
	}

}
