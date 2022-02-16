package aprendendoCollectionsComparable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("1234", "caneta", 2.500,0);
		Produto produto2 = new Produto("432", "lapis", 1.50,10);
		Produto produto3 = new Produto("654", "papel", 3.20,8);
		Produto produto4 = new Produto("001", "calculadora", 4.70,20);
		Produto produto5 = new Produto("899", "regua", 3.70,15);
		Produto produto6 = new Produto("899", "regua", 3.70,15);  // duplicado mas n�o inserido, set n�o permite
		
		// o Set n�o permite duplicidade de informa��es ou produto
		// simplismente ignora e n�o lan�a
		
		//Set<Produto> produtoSet = new HashSet<>();  // n�o mantem a ordem de inser��o
		Set<Produto> produtoSet = new LinkedHashSet<>(); // mantem a ordem de inser��o
		produtoSet.add(produto1);
		produtoSet.add(produto2);
		produtoSet.add(produto3);
		produtoSet.add(produto4);
		produtoSet.add(produto5);
		produtoSet.add(produto6); // n�o inserido
		
		for(Produto p : produtoSet) {
			System.out.println(p);
		}
		
		
		
	}

}
