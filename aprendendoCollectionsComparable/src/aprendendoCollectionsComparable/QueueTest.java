package aprendendoCollectionsComparable;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		queue.add("D");
		queue.add("A");
		queue.add("C");
		queue.add("B");
		System.out.println(queue);  // .remove - extrai primeiro objeto
		                            // .peek - devolve o elemento sem remove lo
		                            // .pool - vai devolver este objeto e vai remove lo
		                            // .offer(String e) - insere um obejeto em uma sequencia pré definida
		                            // .add - lançará um exception
		                            // .size - tamanho da queue
	}

}
