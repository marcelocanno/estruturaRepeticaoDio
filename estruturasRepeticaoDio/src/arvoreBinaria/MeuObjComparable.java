package arvoreBinaria;

public class MeuObjComparable implements Comparable<MeuObjComparable> {
	
	Integer meuValor;
	String minhaString;
	
	public MeuObjComparable(Integer meuValor, String minhaString) {
		this.meuValor = meuValor;
		this.minhaString = minhaString;
	}
	
	public interface Comparable<T>{
		public int comparableTo(T o);
	}
	
	@Override
	public int compareTo(MeuObjComparable outro) {
		
		return this.meuValor > outro.meuValor?
				1 : this.meuValor < outro.meuValor?
						-1 :
							0;
				
	}
	
	

}
