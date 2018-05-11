package strategy.Ex3_noASCII;
/*
Report
CavanhaMan
Relatórios simples: 
-- CABEÇALHO: nome do banco
-- CORPO: titular e saldo da conta
-- RODAPÉ: telefone
Relatórios complexos:
-- CABEÇALHO: nome do banco, endereço, telefone
-- CORPO: titular, agência, número da conta e saldo
-- RODAPÉ: e-mail, e a data atual.
Use dados falsos para os dados do banco.
 */
import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*		
		DadosBancarios.titular = "CavanhaMan";
		DadosBancarios.endereco = "Rua Valentini, 1";
		DadosBancarios.email = "cavanhaman@hotmail.com";
		DadosBancarios.banco = "Itau";
		DadosBancarios.agencia = "12344";
		DadosBancarios.conta = "123456-7";
		DadosBancarios.saldo = 15614.38;
		DadosBancarios.fone = "34-99123-4567";
		DadosBancarios.data = "09/05/2018";
*/		
		
		reportMenu();
		int escolha = sc.nextInt();
		
		if (escolha==1) {
			reportSimples();
		}
		/*-- RODAPÉ: e-mail, e a data atual.  */
		if (escolha==2) {
			reportComplexo();
		}

		sc.close();
	}

	private static void reportMenu() {
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Que relatório você deseja?              |\n");
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|1 - Relatório Simples                   |\n");
		System.out.printf("|2 - Relatório Completo                  |\n");
		System.out.format("+----------------------------------------+%n");
	}

	private static void reportComplexo() {
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Banco: %33s|\n",DadosBancarios.banco);
		System.out.printf("|Endereço: %30s|\n",DadosBancarios.endereco);
		System.out.printf("|Telefone: %30s|\n",DadosBancarios.fone);
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Titular: %31s|\n",DadosBancarios.titular);
		System.out.printf("|Agencia: %31s|\n",DadosBancarios.agencia);
		System.out.printf("|Conta: %33s|\n",DadosBancarios.conta);
		System.out.printf("|Saldo: %33s|\n",DadosBancarios.saldo);
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|E-mail: %32s|\n",DadosBancarios.email);
		System.out.printf("|Data: %34s|\n",DadosBancarios.data);
		System.out.format("+----------------------------------------+%n");
	}

	private static void reportSimples() {
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Banco: %33s|\n",DadosBancarios.banco);
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Titular: %31s|\n",DadosBancarios.titular);
		System.out.printf("|Saldo: %33s|\n",DadosBancarios.saldo);
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|Telefone: %30s|\n",DadosBancarios.fone);
		System.out.format("+----------------------------------------+%n");
	}

}