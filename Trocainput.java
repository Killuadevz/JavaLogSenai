package exercicio_5;

import java.util.Scanner;


public class Trocainput {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o número A");
        double Valor1 = scn.nextDouble();

        System.out.println("Digite o número B");
        double Valor2 = scn.nextDouble();

        double tempValor = Valor1;
        Valor1 = Valor2;
        Valor2 = tempValor;


        System.out.println("Valores Invertidos:");

        System.out.println(Valor1 + "=" + Valor1);
        System.out.println(Valor2 + "=" + Valor2);
    }
}
