package lista7_06_03.Ex4;

public class Poupanca extends Conta {
	private int diaRendimento;
	
	public Poupanca() {
		super();
	}
	
	public Poupanca (double saldo, int diaRendimento) {
		super(saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public int getDiaRendimento() { return diaRendimento; }
	public void setDiaRendimento(int diaRendimento) { this.diaRendimento = diaRendimento; }
	
	//O atributo saldo da classe Poupanca n�o pode ser negativo.
	
	void setSaldo(double valor) {
		//Atribui ao atributo saldo o valor recebido como par�metro
		//desde que este valor n�o seja negativo. Caso seja negativo, n�o faz nada.
	}
	
	void sacar(double valor) {
		//Subtrair o valor recebido como par�metro do atributo saldo 
		//desde que este valor n�o seja negativo. Caso seja negativo, n�o faz nada.
	}
	
}
