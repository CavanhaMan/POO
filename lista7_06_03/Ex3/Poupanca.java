package lista7_06_03.Ex3;

public class Poupanca extends Conta {
	private int diaRendimento;
	//dia do mês em que ocorre o rendimento da poupança
	
	public Poupanca() { super(); }
	
	public Poupanca (double saldo, int diaRendimento) {
		super(saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public int getDiaRendimento() { return diaRendimento; }
	public void setDiaRendimento(int diaRendimento) { this.diaRendimento = diaRendimento; }

	//O atributo saldo da classe Poupanca não pode ser negativo.
	//Atribui ao atributo saldo o valor recebido como parâmetro
	//desde que este valor não seja negativo. Caso seja negativo, não faz nada.

	void sacar(double valor) {
		if (valor>0)
			super.setSaldo(valor);
		//Subtrair o valor recebido como parâmetro do atributo saldo 
		//desde que este valor não seja negativo. Caso seja negativo, não faz nada.
	}
	
}
