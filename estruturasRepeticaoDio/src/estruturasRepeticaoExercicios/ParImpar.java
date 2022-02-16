package estruturasRepeticaoExercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros;
		int numero;
		int quantidadePares =  0;
		int quantidadeImpares = 0;
		
		System.out.println("Quantidade de numeros: ");
		quantidadeNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("numero : ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) {
				quantidadePares++;
			}else quantidadeImpares++;
			
			count = count + 1;
		}while(count < quantidadeNumeros);
		System.out.println("Quantidade de Pares : " + quantidadePares);
		System.out.println("Quantidade de Impares : " + quantidadeImpares);
	}

}
