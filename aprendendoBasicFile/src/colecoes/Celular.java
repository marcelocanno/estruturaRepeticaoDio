package colecoes;

import java.util.Objects;

public class Celular {
	private String nome;
	private String IMEI;
	
	public Celular(String nome, String iMEI) {
		super();
		this.nome = nome;
		IMEI = iMEI;
	}
	
	// reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
	// simetrico para x e y diferente de null, se x.equals(y) == true,logo y.equals(x) tem que ser true
	// transitividade para x, y, z diferente de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) == true
	// consistente x.equals(y) deve sempre retornar o mesmo valor
	// para x diferente de null x.equals(null) tem de retornar  false
	
	// para hashCode
	// se x.equals(y) == true y.hashCode() == x.hashCode();
	// y.hashCode() == x.hashCode() não necessáriamente o equals deverá retornar true
	// x.equals(y)  = false
	// y.hashCode() != x.hashCode() x.equals(y) devera ser false
	
	
	public Celular() {
	}

	public String getNome() {
		return nome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(IMEI, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Celular other = (Celular) obj;
		return Objects.equals(IMEI, other.IMEI) && Objects.equals(nome, other.nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	
	

}
