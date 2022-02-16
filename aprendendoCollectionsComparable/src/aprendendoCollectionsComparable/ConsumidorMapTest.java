package aprendendoCollectionsComparable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {

	public static void main(String[] args) {
		
		Consumidor consumidor = new Consumidor("Marcelo Canno", "2345");
		Consumidor consumidor1 = new Consumidor("DevDojo", "8765");
				
		Produto produto1 = new Produto("1234", "caneta", 2.500,0);
		Produto produto2 = new Produto("432", "lapis", 1.50,10);
		Produto produto3 = new Produto("654", "papel", 3.20,20);
		Produto produto4 = new Produto("001", "calculadora", 4.70,8);
		
		Map<Consumidor,List<Produto>> map = new HashMap<>();
		//Map<Consumidor, Produto> map = new HashMap<>();
		
		List<Produto > produtosCon1 = new ArrayList<>();
		produtosCon1.add(produto1);
		produtosCon1.add(produto2);
		
		List<Produto> produtosCons2 = new ArrayList<>();
		produtosCons2.add(produto3);
		produtosCons2.add(produto4);
		
		
		map.put(consumidor, produtosCon1);
		map.put(consumidor1, produtosCons2);
		for(Map.Entry<Consumidor,List<Produto>> entry : map.entrySet()) {
			System.out.println(entry.getKey().getNome());
			for(Produto produto : entry.getValue()) {
				System.out.println(produto.getNome());
			}
		}
		
		/*
		map.put(consumidor1, produto2);
		map.put(consumidor, produto4);
		
		for(Map.Entry<Consumidor,Produto> entry : map.entrySet()) {
			System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
		}
		*/
		
	}

}
