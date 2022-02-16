package desafiosDioCognizant;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		 
		int valor;
		int quantosPares = 0;
		int quantosImpares = 0;
		int quantosPositivos = 0;
		int quantosNegativos = 0;
		
		for(int i = 0; i < 5; i++) {
			valor = leitor.nextInt();
			if(valor % 2 == 0)quantosPares++; 
			else quantosImpares++;
			if(valor < 0) quantosPositivos++;
			if(valor > 0) quantosNegativos++;
			}
		System.out.println(quantosPares + "par(es)");
		System.out.println(quantosImpares + "impar(es)");
		System.out.println(quantosPositivos + "positivo(s)");
		System.out.println(quantosNegativos + "negativo(s)");
		}
			
	}


