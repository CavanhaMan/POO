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
	
	//O atributo saldo da classe Poupanca não pode ser negativo.
	
	void setSaldo(double valor) {
		//Atribui ao atributo saldo o valor recebido como parâmetro
		//desde que este valor não seja negativo. Caso seja negativo, não faz nada.
	}
	
	void sacar(double valor) {
		//Subtrair o valor recebido como parâmetro do atributo saldo 
		//desde que este valor não seja negativo. Caso seja negativo, não faz nada.
	}
	
}
