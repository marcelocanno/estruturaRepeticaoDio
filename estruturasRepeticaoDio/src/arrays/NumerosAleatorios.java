package arrays;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		int[] numerosAleatorios = new int[6];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(60);
			numerosAleatorios[i] = numero;
		}
		System.out.print("Numeros aleatorios = ");
		
		for(int numero: numerosAleatorios) {
			System.out.print(numero + " ");
		}
		System.out.print("\nSucessores dos numeros aleatorios = ");
		for(int numero : numerosAleatorios) {
			System.out.print((numero+1) + " ");
		}
		System.out.print("\nAntecessores dos numeros aleatorios = ");
		for(int numero : numerosAleatorios) {
			System.out.print((numero-1) + " ");
		}
	}

}
