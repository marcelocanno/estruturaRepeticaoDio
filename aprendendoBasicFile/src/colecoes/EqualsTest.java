package colecoes;

public class EqualsTest {

	public static void main(String[] args) {
		
		String nome1 = "Marcelo canno";
		String nome2 = new String ("Marcelo canno");
		System.out.println(nome1.equals(nome2));
		System.out.println("-----------------------------------------------------------");
		Integer int1 = 5;
		Integer int2 = 5;
		System.out.println(int1.equals(int2));
		System.out.println("-------------------------------------------------------------");
		
		Celular c1 = new Celular("iPhone", "12345");
		Celular c2 = new Celular("iPhone", "12345");
		System.out.println(c1.equals(c2));
		
		
		
		
		
		
	}

}
