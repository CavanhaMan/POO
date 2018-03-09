package lista7_06_03.Ex4;

public class Banco {

	public static void main(String[] args) {
		Conta conta1 = new Conta (0.0);
		Poupanca poupanca1 = new Poupanca (0.0 , 15);
		
		conta1.depositar(10000.0);
		System.out.println("Depósito em conta realizado de R$10.000,00");
		System.out.printf("Saldo atual da conta: R$%.2f\n", conta1.getSaldo());
		
		System.out.println();
		
		conta1.sacar(15000.0);
		System.out.println("Saque em conta realizado de R$15.000,00");
		System.out.printf("Saldo atual da conta: R$%.2f\n", conta1.getSaldo());
		
		System.out.println();
		
		poupanca1.sacar(-20000.0);
		System.out.println("Saque em poupança realizado de R$20.000,00");
		System.out.printf("Saldo atual da conta: R$%.2f\n", poupanca1.getSaldo());
		
	}

}
