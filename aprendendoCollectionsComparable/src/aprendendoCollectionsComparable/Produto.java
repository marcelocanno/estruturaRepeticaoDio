package aprendendoCollectionsComparable;

import java.util.Objects;

public class Produto implements Comparable<Produto>{

	private String serialNumber;
	private String nome;
	private Double preco;
	private int quantidade;
	
	
	public Produto(String serialNumber, String nome, Double preco, int quantidade) {
		super();
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(serialNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(serialNumber, other.serialNumber);
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [serialNumber=" + serialNumber + ", nome=" + nome + ", preco=" + preco + ", quantidade="
				+ quantidade + "]";
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public int compareTo(Produto outroObject) {
		         // negativo se thisObject < outroObject
		         // zero se thisObject == outroObject
		         // positivo se thisObject > outroObject
		//return this.serialNumber.compareTo(outroObject.getSerialNumber()); // lista pelo seriaNumber
		//return this.nome.compareTo(outroObject.getNome()); // lista pelo nome
		return this.preco.compareTo(outroObject.getPreco());  // lista pelo preço
		
	}
	
		



}
