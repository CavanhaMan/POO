package strategy.Ex3_noASCII;

import java.util.Scanner;

public class RelatorioSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Relatorio relat;
		int escolha;
		do {
			reportMenu();
			escolha = sc.nextInt();
			
			if (escolha==1) {
				limpaTela();
				relat = new RelatorioSimples();
				relat.gerarRelatorio();
			}
			/*-- RODAPÉ: e-mail, e a data atual.  */
			if (escolha==2) {
				limpaTela();
				relat = new RelatorioComplexo();
				relat.gerarRelatorio();
			}
			if (escolha==3) {
				limpaTela();
				System.out.format("+----------------------------------------+%n");
				System.out.printf("|           SISTEMA  ENCERRADO           |\n");
				System.out.format("+----------------------------------------+%n");
			}
		}while(escolha!=3);
		sc.close();
	}
	
	private static void limpaTela() {
		for(int i=0;i<50;i++)System.out.printf("\n"); //"limpa a tela"
	}
	
	private static void reportMenu() {
		System.out.printf("\n\n");
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|        Qual opção você deseja?         |\n");
		System.out.format("+----------------------------------------+%n");
		System.out.printf("|1 - Relatório Simples                   |\n");
		System.out.printf("|2 - Relatório Completo                  |\n");
		System.out.printf("|3 - Encerrar o Sistema                  |\n");
		System.out.format("+----------------------------------------+%n");
	}

}