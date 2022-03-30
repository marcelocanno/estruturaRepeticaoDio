package threadClassesSincronizada;

public class ContaTest implements Runnable {
	
	private Conta conta = new Conta();
	
	public static void main(String[] args) {
		ContaTest contatest = new ContaTest();
		Thread marcelo = new Thread(contatest, "Marcelo");
		Thread luiz = new Thread(contatest, "Luiz");
		marcelo.start();
		luiz.start();
	}
	/*                                                // apenas uma thread executa por vez
	private synchronized void saque(int valor) {    // metodo sincronizado de ações
		if(conta.getSaldo() >= valor) {             // duas operações sincronizadas de saque
			System.out.println(Thread.currentThread().getName() + "esta indo sacar");
			conta.saque(valor);
			System.out.println(Thread.currentThread().getName() + "completou o saque, saldo : " + conta.getSaldo());
		}else {
			System.out.println("saldo insuficiente para " + Thread.currentThread().getName() + "efetur o saque, saldo : " + conta.getSaldo());
			
		}
		
	}
	*/
	private  void saque(int valor) {              // outra forma de sincronizar as threads
		synchronized (conta) {
		if(conta.getSaldo() >= valor) {             
			System.out.println(Thread.currentThread().getName() + "esta indo sacar");
			conta.saque(valor);
			System.out.println(Thread.currentThread().getName() + "completou o saque, saldo : " + conta.getSaldo());
		}else {
			System.out.println("saldo insuficiente para " + Thread.currentThread().getName() + "efetur o saque, saldo : " + conta.getSaldo());
		}
	}
		
}
	
	
	
	
	
	@Override
	public void run() {	
		for(int i = 0; i < 5; i++) {
			saque(10);
			if(conta.getSaldo() < 0) {
				System.out.println("não foi possivel efetuar saque");
			}
		}
	}
	
	
	
	

}
