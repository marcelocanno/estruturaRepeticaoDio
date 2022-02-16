package listasCirculares;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ListaCircular<String> minhaListaCircular = new ListaCircular<>();
		
		minhaListaCircular.add("c0");
		System.out.println(minhaListaCircular);
		
		minhaListaCircular.remove(0);
		System.out.println(minhaListaCircular);
		
		minhaListaCircular.add("c1");
		minhaListaCircular.add("c2");
		System.out.println(minhaListaCircular);
		
		
		minhaListaCircular.add("c3");
		System.out.println(minhaListaCircular);
		
		System.out.println("Indece 0 = " + minhaListaCircular.get(0));
		System.out.println("Indece 1 = " + minhaListaCircular.get(1));
		System.out.println("Indece 2 = " + minhaListaCircular.get(2));
		System.out.println("---------------------------------------");
		System.out.println("Indece 3 = " + minhaListaCircular.get(3));
		System.out.println("Indece 4 = " + minhaListaCircular.get(4));
		
		// por ser lista circular quando informamos um indece inexistente
		// fica em um loop circular repetindo as posições existentes
		
		System.out.println("---------------------------------------");
		for(int i = 0; i < 20; i++) {
			System.out.println(minhaListaCircular.get(i));
		}
		
	}

}
