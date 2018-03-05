package Lista5_27_02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		
		Conta conta = new Conta("Cavanha");
		System.out.println(conta.getId());

		conta.setSaldo(500);
		System.out.println(conta.getSaldo());
		
		//ABERTURA DE CONTA
		System.out.printf("Nome do cliente: ");
		conta.setTitular(sc.nextLine());
		System.out.printf("Número da conta: ");
		conta.setNumero(Integer.parseInt(sc.nextLine()));
		System.out.printf("Agencia: ");
		conta.setAgencia(sc.nextLine());
		System.out.printf("Informe o salário do cliente: ");
		conta.setSalario(Double.parseDouble(sc.nextLine()));
		System.out.printf("O limite da conta será equivalente a 50% do salário do cliente.");
		//System.out.printf(format, args);
	}

}
