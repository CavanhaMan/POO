package strategy.Ex3;

import java.util.Scanner;

public class RelatorioSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
