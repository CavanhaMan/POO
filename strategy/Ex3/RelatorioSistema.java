package strategy.Ex3;

import java.util.Scanner;

public class RelatorioSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DadosBancarios.titular = "CavanhaMan";
		DadosBancarios.endereco = "Rua Atilio Valentini, 1";
		DadosBancarios.email = "cavanhaman@hotmail.com";
		DadosBancarios.banco = "Itau";
		DadosBancarios.agencia = "123";
		DadosBancarios.conta = "123456-7";
		DadosBancarios.saldo = 15614.38;
		DadosBancarios.fone = "34-99123-4567";
		DadosBancarios.data = "09/05/2018";
		
		Relatorio relatorio;
		
		reportMenu();
		int escolha = sc.nextInt();
		
		if (escolha==1) {
			relatorio = new RelatorioSimples();
			relatorio.gerarRelatorio();
		}
		/*-- RODAPÉ: e-mail, e a data atual.  */
		if (escolha==2) {
			relatorio = new RelatorioComplexo();
			relatorio.gerarRelatorio();
		}
		
		sc.close();
	}

	private static void reportMenu() {
		System.out.format("╔════════════════════════════════════════╗%n");
		System.out.printf("║Qual relatório você deseja?             ║\n");
		System.out.format("╠════════════════════════════════════════╣%n");
		System.out.printf("║1 - Relatório Simples                   ║\n");
		System.out.printf("║2 - Relatório Completo                  ║\n");
		System.out.format("╚════════════════════════════════════════╝%n");
	}

}
