package listaDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada <String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();
		
		minhaListaEncadeada.add("c1");
		minhaListaEncadeada.add("c2");
		minhaListaEncadeada.add("c3");
		minhaListaEncadeada.add("c4");
		minhaListaEncadeada.add("c5");
		minhaListaEncadeada.add("c6");
		
		System.out.println("Tamanho da lista = " + minhaListaEncadeada.size()+"\n");
		
		System.out.println(minhaListaEncadeada);
		
		minhaListaEncadeada.remove(3);
		
		System.out.println(minhaListaEncadeada);
		
		minhaListaEncadeada.add(6,"99");        // substitui o sexto pelo 99
		
		System.out.println(minhaListaEncadeada);
		
		
		System.out.println();
		
	}

}
