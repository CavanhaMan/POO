package lista7_06_03.Ex2_2;

public class Professor extends Funcionario {
	
	public Professor() { super(); }

	public Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome, matricula, salario);
	}

	double getSalarioPrimeiraParcela() {
		//return super.getSalarioPrimeiraParcela() + super.getSalarioSegundaParcela();
		return getSalario();
	}
	
	double getSalarioSegundaParcela() {
		return 0.0;
	}
	
}
