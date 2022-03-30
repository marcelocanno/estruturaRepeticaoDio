package threadClassesSincronizada;

import java.util.LinkedList;
import java.util.List;

class listaNomes{
	private List<String> nomes = new LinkedList<>();
	
	public synchronized void add(String nome) {
		nomes.add(nome);
	}
	
	public synchronized void removerPrimeiro() {
		if(nomes.size() > 0) {
			System.out.println(nomes.remove(0));
		}
	}	
}
public class ThreadSafeTest {
	public static void main(String[] args) {
		listaNomes nome = new listaNomes();
		nome.add("Marcelo Canno");
		class RemovedorDeNomes extends Thread{
			public void run() {
				nome.removerPrimeiro();
			}
		}
		
		new RemovedorDeNomes().start();
		new RemovedorDeNomes().start();
	}
	
 
}
