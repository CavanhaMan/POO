package lista7_06_03.Ex5;

public class Vendedor extends Funcionario {
	private double comissao;
	
	public double getComissao() { return comissao; }
	public void setComissao(double comissao) { this.comissao = comissao; }

	public Vendedor (String nome, String matricula, double salario, double comissao) {
		super(nome,matricula,salario);
		this.comissao = comissao;
	}
	
	@Override
	public double calculaSalario() {
		return super.getSalario_base() + comissao;
	}

}
