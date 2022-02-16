package aprendendoCollectionsComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest {

	public static void main(String[] args) {
		
		List<Integer> numeros = new 	ArrayList();
		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);
		
		// (-(ponto de inserção) -1) -1 -1 = -2
		
		Collections.sort(numeros);
		// 0,1,2,3
		// 0,2,3,4
		System.out.println(Collections.binarySearch(numeros,2));  // lista posição do numero
		//System.out.println(numeros.get(Collections.binarySearch(numeros,2)));
		
		System.out.println("___________________________________________________________________");
		
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("1234", "caneta", 2.500);
		Produto produto2 = new Produto("432", "lapis", 1.50);
		Produto produto3 = new Produto("654", "papel", 3.20);
		Produto produto4 = new Produto("001", "calculadora", 4.70);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		Collections.sort(produtos, new produtoNomeComparator()); 	
		Produto produto5 = new Produto("000", "caderno", 3.600);
		
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
		System.out.println("____________________________________________________________________");
		
		System.out.println(Collections.binarySearch(produtos, produto5, new produtoNomeComparator()));
		
		System.out.println("_____________________________________________________________________");
		
		Integer[] arrayInteger = new Integer[4];
		arrayInteger[0] = 2;
		arrayInteger[1] = 0;
		arrayInteger[2] = 4;
		arrayInteger[3] = 3;
		Arrays.sort(arrayInteger);
		System.out.println(Arrays.binarySearch(arrayInteger,1));
		
	}

}
