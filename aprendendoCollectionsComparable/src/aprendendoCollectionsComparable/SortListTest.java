package aprendendoCollectionsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Marcelo");
		nomes.add("Luiz");
		nomes.add("Walter");
		nomes.add("DevDojo");
		nomes.add("Junior");
		nomes.add(0, "Ana");  // voc� acrescenta um nome na posi��o zero
		
		Collections.sort(nomes); // ordena a lista pela ordem alfabetica
		
		List<Double> numeros = new ArrayList<>();
		numeros.add(1.5);
		numeros.add(3.2);
		numeros.add(2.1);
		numeros.add(1.2);
		numeros.add(1, 3.1);
		
		Collections.sort(numeros);
		
		for(Double numero : numeros){
			System.out.println(numero);
		}
		
		for(String nome : nomes) {
			System.out.println(nome);  // ordem de impres�o de acordo com posi��o
		}
		

	}

}
