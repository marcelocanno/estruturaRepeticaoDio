package threads;

// tipos threads
// deamon - pode ser parada pela JVM para excução de outra thread
// User - a JVM não interrompe sua execução para executar outra thread

class ThreadExemplo extends Thread {
	private char c;
	
	public ThreadExemplo(char c) { 
		this.c = c;
	}
	public ThreadExemplo(String string) {
	}
	@Override
	public void run() {
		System.out.println("Thread executada  " + Thread.currentThread().getName());
		for(int i = 0; i < 10; i++) {
			System.out.print(c);
			if(i % 1 == 0) {
				System.out.println();
			}
		}
	}
}

class ThreadExemploRunnable implements Runnable{
	
	private char c;
	
	public ThreadExemploRunnable(char c) { 
		this.c = c ;
	}
	public ThreadExemploRunnable(String string) {
	}
	@Override
	public void run() {
		System.out.println("Thread executada  " + Thread.currentThread().getName());
		for(int i = 0; i < 1; i++) {
			System.out.print(c);
			if(i % 1 == 0) {
				System.out.println();
			}
			Thread.yield();               // thread sem garantis de execução, de retorna ao estado runnable
										 // sem garantia de voltar ao estado runnable												
			try {
				Thread.sleep(2000);       // thread dormindo por time determinado
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
public class ThreadTest {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//ThreadExemplo t1 = new ThreadExemplo("A");
		//ThreadExemplo t2 = new ThreadExemplo("B");
		//ThreadExemplo t3 = new ThreadExemplo("C");
		//ThreadExemplo t4 = new ThreadExemplo("D");
		Thread t1 = new Thread(new ThreadExemploRunnable("A"), "T1");
		Thread t2 = new Thread(new ThreadExemploRunnable("B"), "T2");
		Thread t3 = new Thread(new ThreadExemploRunnable("C"), "T3");
		Thread t4 = new Thread(new ThreadExemploRunnable("D"), "T4");
		t4.setPriority(Thread.MAX_PRIORITY);   // Prioridade de execução de uma thread
		t3.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.NORM_PRIORITY);
		
		//t1.run();
		//t2.run();
		//t3.run();
		//t4.run();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}              // você está dizendo ao main que execute primeiro a thread t1 para depois executar outra thread
		               // não executa o t2 enquanto não terminar o t1
		t2.start();
		t3.start();
		t4.start();
		
	}
}
