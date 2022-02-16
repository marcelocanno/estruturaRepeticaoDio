package aprendendoGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("String");
		lista.add("Marcelo");
		lista.add("Canno");
		
		for(String obj : lista) {
			System.out.println(obj);
		}
	}
}
