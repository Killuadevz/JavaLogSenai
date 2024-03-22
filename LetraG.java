package exercicio_5;

import java.util.Scanner;

public class LetraG {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite o valor de A:");
		int A = scn.nextInt();
		
		System.out.print("Digite o valor de B:");
		int B = scn.nextInt();
		
		System.out.print("Digite o valor de C:");
		int C = scn.nextInt();
		
		System.out.print("Digite o valor de D:");
		int D = scn.nextInt();
		
		int[] resultadomais = new int [6];
	    int[] resutadomulti = new int [6];
		
		resultadomais[0] = A + B;
		resultadomais[1] = A + C;
		resultadomais[2] = A + D;
		resultadomais[3] = B + C;
		resultadomais[4] = B + D;
		resultadomais[5] = C + D;
		
		
		resutadomulti[0] = A * B;
		resutadomulti[1] = A * C;
		resutadomulti[2] = A * D;
		resutadomulti[3] = B * C;
		resutadomulti[4] = B * D;
		resutadomulti[5] = C * D;
		
		
System.out.println("Resultado Adição:");
for (int resultadoM : resultadomais)
{
	System.out.println(resultadoM);
}


System.out.println("Resultado Multiplicação:");
for (int resultadoX : resutadomulti)
{
	System.out.println(resultadoX);
       }  
						
	}

}
