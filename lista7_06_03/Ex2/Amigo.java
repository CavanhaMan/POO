package lista7_06_03.Ex2;

public class Amigo extends Pessoa{
	private String diaDoAniversario;
	
	public Amigo() {
		super();
	}

	public Amigo (String nome, char sexo, int idade, String dia) {
		super(nome, sexo, idade);
		diaDoAniversario = dia;
	}
	
}
