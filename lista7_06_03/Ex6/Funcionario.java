package lista7_06_03.Ex6;

public abstract class Funcionario {
	private String nome, matricula;
	private double salario_base;
	
	public abstract double calculaSalario();
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, String matricula, double salario_base) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario_base = salario_base;
	}
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getMatricula() { return matricula; }
	public void setMatricula(String matricula) { this.matricula = matricula; }
	
	public double getSalario_base() { return salario_base; }
	public void setSalario_base(double salario_base) { this.salario_base = salario_base; }
	
	
}
