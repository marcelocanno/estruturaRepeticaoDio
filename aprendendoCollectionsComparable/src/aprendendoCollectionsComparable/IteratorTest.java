package aprendendoCollectionsComparable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("1234", "caneta", 2.500,0);
		Produto produto2 = new Produto("432", "lapis", 1.50,10);
		Produto produto3 = new Produto("654", "papel", 3.20,8);
		Produto produto4 = new Produto("001", "calculadora", 4.70,20);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		Iterator<Produto > produtoIterator = produtos.iterator();
		// hasNext();
		// next();
		while(produtoIterator.hasNext()) {
			if(produtoIterator.next().getQuantidade() == 0) {       // elinina produtos quantidade zerp
			produtoIterator.remove();
			}
		}
		System.out.println(produtos.size());	// apresenta quantidade de produtos com unidades
		
		
		
	}

}
