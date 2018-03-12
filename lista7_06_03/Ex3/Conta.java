package lista7_06_03.Ex3;

public class Conta {
	private double saldo;
	//O atributo saldo pode ser negativo.
	
	public Conta () { super(); }
	
	public Conta (double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public double getSaldo() { return saldo; }
	public void setSaldo(double saldo) { this.saldo = saldo; }

	void depositar(double valor) {
		this.saldo += valor;
		//Acrescentar o valor recebido como parâmetro ao atributo saldo
	}
	
	void sacar(double valor) {
		this.saldo -= valor;
		//Subtrair o valor recebido como parâmetro do atributo saldo
	}
	
}
