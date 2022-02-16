package arvoreBinaria;

public class BinNo <T extends Comparable<T>>{
	
	private T conteudo;
	private BinNo<T> noEsq;
	private BinNo<T> noDir;
	
	/*
	public void showTree(BinNo noAtual) {    // algoritmo recursivo
		if(noAtual != null) {
			showTree(noAtual.noEsq);
			System.out.println(noAtual.conteudo);
			showTree(noAtual.noDir);
		}
	}
	*/
	/*
	 // Atravessamento in-ordem
	 // saida: 2,10,12,13,20,25,29,31
	public void showInOrder(BinNo atual) {
		if(atual != null) {
			showInOrder(atual.noEsq);
			System.out.println(atual.conteudo);
			showInOrder(atual.noDir);
		}
	}
	*/
	/*  
	// Atravessamento pré-ordem
	// saida: 13,10,2,12,25,20,31,29.
	public void showPreOrder(BinNo atual) {
		if(atual != null) {
			System.out.println(atual.conteudo);
			showPreOrder(atual.noEsq);
			showPreOrder(atual.noDir);
		}
	}
	*/
	/*
	//Atravessamento pós-ordem
	// saida: 2,12,10,20,29,31,25,13.
	
	public void showPreOrdem(BinNo atual) {
		if(atual != null) {
			showInOrder(atual.noEsq);
			showInOrder(atual.noDir);
			System.out.println(atual.conteudo);
		}
	}
	*/
	
	


	public BinNo(T conteudo, BinNo<T> noEsq, BinNo<T> noDir) {
		super();
		this.conteudo = conteudo;
		this.noEsq = noEsq;
		this.noDir = noDir;
	}

	public BinNo() {
		super();
	}

	public BinNo(T conteudo) {
		this.conteudo = conteudo;
		this.noEsq = this.noDir = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public BinNo<T> getNoEsq() {
		return noEsq;
	}

	public void setNoEsq(BinNo<T> noEsq) {
		this.noEsq = noEsq;
	}

	public BinNo<T> getNoDir() {
		return noDir;
	}

	public void setNoDir(BinNo<T> noDir) {
		this.noDir = noDir;
	}

	@Override
	public String toString() {
		return "BinNo [conteudo=" + conteudo + "]";
	}	
}
