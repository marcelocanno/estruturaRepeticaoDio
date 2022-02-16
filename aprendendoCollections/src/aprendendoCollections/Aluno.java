package aprendendoCollections;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Aluno implements Serializable { 
	
	
	private long id;
	private String nome;
	private String password;
	private static String nomeEscola = "DevDojo";
	
	
	public Aluno(long id, String nome, String password) {
		System.out.println("dentro do construtor");
		
		this.id = id;
		this.nome = nome;
		this.password = password;
		
	}
	
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", password=" + password + "]";
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static String getNomeEscola() {
		return nomeEscola;
	}
	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
	}
	
}
