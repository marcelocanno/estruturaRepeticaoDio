package aprendendoCollectionsComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class produtoNomeComparator implements Comparator<Produto>{
	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}	
}
public class SortProdutoTest {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("1234", "caneta", 2.500);
		Produto produto2 = new Produto("432", "lapis", 1.50);
		Produto produto3 = new Produto("654", "papel", 3.20);
		Produto produto4 = new Produto("001", "calculadora", 4.70);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		Produto[] produtosArray = new Produto[4];
		produtosArray[0] =  produto1;
		produtosArray[1] =  produto2;
		produtosArray[2] =  produto3;
		produtosArray[3] =  produto4;
		
		Arrays.sort(produtosArray);
		for(Produto produto : produtosArray  ) {
			System.out.println(produto);
		}
		System.out.println("________________________________________________________");
		
		System.out.println(Arrays.toString(produtosArray));
		
		
		//Collections.sort(produtos); // ordenado por numero de registro
		Collections.sort(produtos, new produtoNomeComparator());  // ordenado por nome
		
		/*
		for(Produto produto : produtos  ) {
			System.out.println(produto);
		}
		*/
		
		
	}

}
