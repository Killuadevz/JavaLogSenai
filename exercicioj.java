package aula06;

import java.util.Scanner;

public class exercicioj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		
		System.out.println("digite o  valor da variavel a");
		int Var1 = scn.nextInt();
		
		System.out.println("digite o valor da variavel b");
		int Var2 = scn.nextInt();
		
		
		System.out.println("potencia = " + (Math.pow(Var1, 2) - Math.pow(Var2, 2)));
				
		;
	}

}
