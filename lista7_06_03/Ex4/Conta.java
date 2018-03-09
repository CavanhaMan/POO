package lista7_06_03.Ex4;

public class Conta {
	private double saldo;
	//O atributo saldo pode ser negativo.
	
	public Conta () {
		super();
	}
	
	public Conta (double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public double getSaldo() { return saldo; }
	//public void setSaldo(double saldo) { this.saldo = saldo; }

	void depositar(double valor) {
		//Acrescentar o valor recebido como parâmetro ao atributo saldo
	}
	
	void sacar(double valor) {
		//Subtrair o valor recebido como parâmetro do atributo saldo
	}
	
	
}
