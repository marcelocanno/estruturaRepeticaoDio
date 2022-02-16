package conceitoNo;

public class No<T> {
	
	// refatoracao com generic
	
	
	private T conteudo;
	private No<T> proximoNo;

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}

	public No(String conteudo) {
		super();
		this.conteudo = (T) conteudo;
		this.proximoNo = proximoNo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = (T) conteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	} 
}

		// normal sem generic

		/*
		private String conteudo;
		private No proximoNo;

		@Override
		public String toString() {
			return "No [conteudo=" + conteudo + "]";
		}

		public No(String conteudo) {
			super();
			this.conteudo = conteudo;
			this.proximoNo = proximoNo;
		}

		public String getConteudo() {
			return conteudo;
		}

		public void setConteudo(String conteudo) {
			this.conteudo = conteudo;
		}

		public No getProximoNo() {
			return proximoNo;
		}

		public void setProximoNo(No proximoNo) {
			this.proximoNo = proximoNo;
		} 
	}
	*/

