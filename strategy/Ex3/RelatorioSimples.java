package strategy.Ex3;

public class RelatorioSimples extends Relatorio {

	@Override
	public void imprimeRelatorio() {
		System.out.format("╔════════════════════════════════════════╗%n");
		System.out.printf("║Qual relatório você deseja?             ║\n");
		System.out.format("╠════════════════════════════════════════╣%n");
		System.out.printf("║1 - Relatório Simples                   ║\n");
		System.out.printf("║2 - Relatório Completo                  ║\n");
		System.out.format("╚════════════════════════════════════════╝%n");
	}
}
