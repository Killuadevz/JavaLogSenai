package aula_06;

import java.util.Scanner;

public class operadores_aritimeticos {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
        System.out.println("Digite o primeiro número");
        
		int num1 = scn.nextInt();;
		
        System.out.println("Digite o Segundo número");
        
		int num2 = scn.nextInt();
				
		System.out.println("A Soma = " + (num1 + num2));
	
		System.out.println("A Multiplicação = " + (num1 * num2));

		System.out.println("A Divisão = " + (num1 / num2));

		System.out.println("A Subtração = " + (num1 - num2));

		System.out.println("A Potencia = "  + (Math.pow(num1,num2)));

		System.out.println("A Raiz Quadrada = "  + (Math.sqrt(num1)));

		System.out.println("A Raiz Quadrada 2 = "  + (Math.sqrt(num2)));

	}

}
