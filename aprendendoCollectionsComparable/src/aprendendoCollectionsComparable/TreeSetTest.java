package aprendendoCollectionsComparable;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("1234", "caneta", 2.500,0);
		Produto produto2 = new Produto("432", "lapis", 1.50,10);
		Produto produto3 = new Produto("654", "papel", 3.20,8);
		Produto produto4 = new Produto("001", "calculadora", 4.70,20);
		Produto produto5 = new Produto("899", "regua", 3.70,15);
		Produto produto6 = new Produto("899", "regua", 3.70,15);
		
		NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
		produtoNavigableSet.add(produto1);
		produtoNavigableSet.add(produto2);
		produtoNavigableSet.add(produto3);
		produtoNavigableSet.add(produto4);
		produtoNavigableSet.add(produto5);
		produtoNavigableSet.add(produto6);   // não insere produto duplicado também
		
		/*
		for(Produto produto : produtoNavigableSet) {
			System.out.println(produto);
		}
		*/
		
		for(Produto produto : produtoNavigableSet.descendingSet()){  // lista produtos em ordem decrecente
			System.out.println(produto);
		}
		
		System.out.println("______________________________________________________________");
		
		// lower < retorna o menor preço do produto anterior ao selecionado
		// floor <= retorna o menor ou igual do produto selecionado
		// higher > retorna produto preço maior depois do selecionado
		// ceiling >= retorna o maior ou igual preço do selecionado depois 
		
		System.out.println(produtoNavigableSet.lower(produto4));
		
		System.out.println(produtoNavigableSet.floor(produto3));
		
		System.out.println(produtoNavigableSet.higher(produto5));
		
		System.out.println(produtoNavigableSet.ceiling(produto5));
		
		System.out.println("_____________________________________________");
		
		
		System.out.println(produtoNavigableSet.size());
		System.out.println(produtoNavigableSet.pollFirst()); // mostra o primeiro mas é excluido da lista
		System.out.println(produtoNavigableSet.size());
		System.out.println("_____________________________________________");
		
		System.out.println(produtoNavigableSet.size());
		System.out.println(produtoNavigableSet.pollLast()); // mostra o ultimo mas é excluido da lista
		System.out.println(produtoNavigableSet.size());
		
	}

}
