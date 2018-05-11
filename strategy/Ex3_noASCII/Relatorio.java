/*
Relat�rios simples: 
-- CABE�ALHO: nome do banco
-- CORPO: titular e saldo da conta
-- RODAP�: telefone
Relat�rios complexos:
-- CABE�ALHO: nome do banco, endere�o, telefone
-- CORPO: titular, ag�ncia, n�mero da conta e saldo
-- RODAP�: e-mail, e a data atual.
CavanhaMan
Use dados falsos para os dados do banco.
 */
package strategy.Ex3_noASCII;

public abstract class Relatorio {
	public void gerarRelatorio(){
		imprimeRelatorio();
	}
	public abstract void imprimeRelatorio();
}
