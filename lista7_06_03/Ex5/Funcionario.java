package lista7_06_03.Ex5;

public abstract class Funcionario {
	private String nome;
	private String matricula;
	private Double salario_base;
	
	public Funcionario() { super(); }
	
	public Funcionario(String nome, String matricula, Double salario_base) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario_base = salario_base;
	}

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getMatricula() { return matricula; }
	public void setMatricula(String matricula) { this.matricula = matricula; }
	
	public Double getSalario_base() { return salario_base; }
	public void setSalario_base(Double salario_base) { this.salario_base = salario_base; }

	double calculaSalario() {
		return salario_base;
	}
	
}
