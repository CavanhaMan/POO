package lista7_06_03.Ex2_2;

public class Pessoa {
	private String nome;
	private String sobrenome;
	
	public Pessoa (String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Pessoa () { super(); }

	public String getNome() { return this.nome; } 
	public void setNome(String nome) { this.nome = nome; }
	
	public String getSobreNome() { return this.sobrenome; } 
	public void setSobreNome(String sobrenome) { this.nome = sobrenome; }
		
	String getNomeCompleto() {
		return nome + " " + sobrenome;
	}
	
}
