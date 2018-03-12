package lista7_06_03.Ex2_1;

public class Amigo extends Pessoa{
	private String diaDoAniversario;
	
	public Amigo() { super(); }

	public Amigo (String nome, char sexo, int idade, String dia) {
		super(nome, sexo, idade);
		diaDoAniversario = dia;
	}
	

	public String getDiaDoAniversario() { return this.diaDoAniversario; } 
	public void setDiaDoAniversario(String diaDoAniversario) { this.diaDoAniversario = diaDoAniversario; }

	
	
	
}
