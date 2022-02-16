package aprendendoCollectionDio;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetArvoreBinariaExemplo {

	public static void main(String[] args) {
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		treeCapitais.add("Belo Horizonte");
		treeCapitais.add("S�o Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florian�polis");
		treeCapitais.add("Goi�nia");

		System.out.println("=====> " + treeCapitais);
		
		treeCapitais.remove("S�o Paulo");
		
		System.out.println("----> " + treeCapitais);
		
		
		System.out.println("++++ > " + treeCapitais.last());
		
		System.out.println("-----> " + treeCapitais.lower("Rio de Janeiro"));
		
		System.out.println("=======> " + treeCapitais.higher("Florian�polis"));
		
		System.out.println("+++++> " + treeCapitais);

		
		System.out.println("------> " + treeCapitais.pollFirst());
		
		
		
		System.out.println("+++++> " + treeCapitais.pollLast());
		
		System.out.println("----> " + treeCapitais);
		
		Iterator<String> iterator = treeCapitais.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("====> " + iterator.next());
		}
		
		for(String capital: treeCapitais) {
			System.out.println("---> " + capital);
		}
		
		//treeCapitais.clear();
		}

}
