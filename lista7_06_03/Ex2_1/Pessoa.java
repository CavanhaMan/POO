package lista7_06_03.Ex2_1;

public class Pessoa {
	private String nome;
	private char sexo;
	private int idade;
	
	public Pessoa (String nome, char sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public Pessoa () { super(); }
	
	public String getNome() { return this.nome; } 
	public void setNome(String nome) { this.nome = nome; }
	
	public char getSexo() { return this.sexo; } 
	public void setSexo(char sexo) { this.sexo = sexo; }
	
	public int getIdade() { return this.idade; } 
	public void setIdade(int idade) { this.idade = idade; }
	
	
}
