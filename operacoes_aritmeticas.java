package aula06;

import java.util.Scanner;

public class operacoes_aritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner scn = new Scanner(System.in);
       
       System.out.println("Digite o primeiro número:");
       int num1 = scn.nextInt();
       
       System.out.println("Digite o segundo número:");
       int num2 = scn.nextInt();
       
       System.out.println("Soma  = " + (num1 + num2 ));
       System.out.println("subtração = " + (num1 - num2));
       System.out.println("Multiplicação = " + (num1 * num2));
       System.out.println("Divisão = " + (num1 / num2));
       
       System.out.println("potência = " + (Math.pow(num1, num2)));
       System.out.println("raiz quadrada = " + (Math.sqrt(num1)));
       
	}

}
