package lista7_06_03.Ex5;

public class Gerente extends Funcionario {

	public Gerente(String nome, String matricula, double salario) {
		super(nome,matricula,salario);
	}

	@Override
	public double calculaSalario() {
		return (super.getSalario_base()*2);
	}

}
