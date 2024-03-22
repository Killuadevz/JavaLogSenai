package aula06;

import java.util.Scanner;


public class exercicioi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);                                         
        
        System.out.println("digite o primeiro número =");
        int num1 = scn.nextInt();
        
        System.out.println("potencia = " + (Math.pow(num1, 2)));
	}

}
