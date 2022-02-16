package desafiosDioCognizant;

import java.util.Scanner;

public class ExercioElfos {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int N = leitor.nextInt();
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		
		System.out.println("Digite seu numero");
		
		if( (A + B ) > N) {
			System.out.println("Deixar para amanhã");
			
			
		}else
		    System.out.println("Farei hoje");
		
		
		
		
		
	}

}
