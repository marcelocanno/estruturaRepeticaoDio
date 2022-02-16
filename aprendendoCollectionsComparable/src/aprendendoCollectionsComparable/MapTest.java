package aprendendoCollectionsComparable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		// v de value - valor
		// K de key - chave
		// map trabalha com chave e valor
		// n�o aceita duplicidade
		
		Map<String,String> map = new LinkedHashMap<>(); // mantem a ordem de inser��o
		//Map<String,String> map = new HashMap<>(); // n�o mantem a ordem de inser��o
		map.put("teklado","teclado");
		map.put("mouze","mouse");
		map.put("vc","voc�");
		//map.put("vc","voce");
		
		for(String Key : map.keySet()) {
			System.out.println(Key);  // obtem todas as chaves
		}
		
		System.out.println("__________________________________________________");
		
		for(String Key : map.values()) {
			System.out.println(Key);    // obtem todas os valores
		}
		
		System.out.println("_________________________________________________");
		
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue()); // mostra cheve e valor
		}
	}

}
