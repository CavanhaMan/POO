package lista7_06_03.Ex3;

public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
	}

	public int getMatricula() { return matricula; }
	public void setMatricula(int matricula) { this.matricula = matricula; }

	public double getSalario() { return salario; }
	public void setSalario(double salario) { this.salario = salario; }

	void setSalario(int valor) {
		if (valor>0)
			salario = valor;
	}
	
	double getSalarioPrimeiraParcela() {
		return 0.6 * salario;
	}
	
	double getSalarioSegundaParcela() {
		return 0.4 * salario;
	}
	
	
}
