package strategy.Ex3_noASCII;
/*
DadosBancários
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
public class DadosBancarios {
	public static String titular = "CavanhaMan";				//corpo 1 e 2
	public static String endereco = "Rua Atilio Valentini, 1";	//cabeça 2
	public static String email = "cavanhaman@hotmail.com";		//rodape 2
	public static String banco = "Itau";						//cabeçalho 1 e 2
	public static String agencia = "123";						//corpo 2
	public static String conta = "123456-7";					//corpo 2
	public static Double saldo = 15614.38;						//corpo 1 e 2
	public static String fone = "34-99123-4567";				//rodape 1 e 2
	public static String data = "09/05/2018";					//rodape 2
}