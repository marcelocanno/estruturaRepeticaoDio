package listasCirculares;

public class ListaCircular<T> {
	
	private No<T> cabeca;
	private No<T> cauda;
	private int tamanholista;
	
	public ListaCircular() {
		this.cauda = null;
		this.cabeca = null;
		this.tamanholista = 0;	
	}
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if (this.tamanholista == 0) {
			this.cabeca = novoNo;
			this.cauda = this.cabeca;
			this.cabeca.setNoProximo(cauda);
		}else {
			novoNo.setNoProximo(this.cauda);
			this.cabeca.setNoProximo(novoNo);
			this.cauda = novoNo;
		}
		this.tamanholista++;
	}
	public void remove(int index) throws Exception {
		if(index >= this.tamanholista)
		throw new Exception("O indice é maior que o tamanho da lista");
		No<T> noAuxiliar = cauda;
		if(index == 0) {
			this.cauda = this.cauda.getNoProximo();
			this.cabeca.setNoProximo(this.cauda);
		}else if(index == 1) {
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
		}else {
			for(int i = 0; i < index-1; i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
		}
		this.tamanholista--;
	}
	public T get(int index) throws Exception {
		return this.getNo(index).getConteudo();
	}
	@SuppressWarnings("unused")
	private No<T> getNo(int index) throws Exception{
		if(this.isEmpty()) 
		throw new Exception("A lista está vazia");
		if(index == 0) {
			return this.cauda;
		}
		No<T> noAuxiliar = this.cauda;
		for(int i = 0; (i< index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;
	}
	public boolean isEmpty() {
		return this.tamanholista == 0? true : false;
	}
	public int size() {
		return this.tamanholista;
	}
	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = this.cauda;
			for(int i = 0; i < this.size(); i++) {
				strRetorno += "[No(conteudo=" + noAuxiliar.getConteudo() + "}]--->";
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";
			return strRetorno;
	}
	
}
