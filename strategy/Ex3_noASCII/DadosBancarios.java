package strategy.Ex3_noASCII;
/*
DadosBanc�rios
CavanhaMan
Relat�rios simples: 
-- CABE�ALHO: nome do banco
-- CORPO: titular e saldo da conta
-- RODAP�: telefone
Relat�rios complexos:
-- CABE�ALHO: nome do banco, endere�o, telefone
-- CORPO: titular, ag�ncia, n�mero da conta e saldo
-- RODAP�: e-mail, e a data atual.

Use dados falsos para os dados do banco.
 */
public class DadosBancarios {
	public static String titular = "CavanhaMan";				//corpo 1 e 2
	public static String endereco = "Rua Atilio Valentini, 1";	//cabe�a 2
	public static String email = "cavanhaman@hotmail.com";		//rodape 2
	public static String banco = "Itau";						//cabe�alho 1 e 2
	public static String agencia = "123";						//corpo 2
	public static String conta = "123456-7";					//corpo 2
	public static Double saldo = 15614.38;						//corpo 1 e 2
	public static String fone = "34-99123-4567";				//rodape 1 e 2
	public static String data = "09/05/2018";					//rodape 2
}