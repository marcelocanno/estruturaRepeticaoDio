package aprendendoCollectionsComparable;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
		NavigableMap<String,String> map = new TreeMap<>();
		map.put("A", "letra A");
		map.put("D", "letra D");
		map.put("B", "letra B");
        map.put("C", "letra C");
        
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("_____________________________________________________");
		System.out.println(map.headMap("C",true));
		System.out.println("_____________________________________________________");
		System.out.println(map.ceilingKey("C"));
		System.out.println("_____________________________________________________");
		System.out.println(map.higherKey("C"));
		System.out.println("_____________________________________________________");
		System.out.println(map.descendingKeySet());  // relação em ordem invertida pela chave
		System.out.println("_____________________________________________________");
		System.out.println(map.descendingMap()); // relação invertida com chave e valor
		System.out.println("_____________________________________________________");
	}

}
