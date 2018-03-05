package lista6_05_03;

import java.util.ArrayList;

public class Leilao {
	private String nome;
	private Double vrinicial;
	private Double vrminimo;
	private Boolean status;
	
	Leilao (String nome, Double vrinicial, Double vrminimo) {
		super();
		this.nome=nome;
		this.vrinicial=vrinicial;
		this.vrminimo=vrminimo;
	}
	
	public String getNome() { return this.nome; } 
	public void setNome(String nome) { this.nome = nome; }

	public Double getVrInicial() { return this.vrinicial; } 
	public void setVrInicial(Double vrinicial) { this.vrinicial = vrinicial; }
	
	public Double getVrMinimo() { return this.vrminimo; } 
	public void setVrMinimo(Double vrminimo) { this.vrminimo = vrminimo; }
	
	public void registrarLance(String Nome, Double Valor) {
		//se o leilão estiver aberto e se valor for maior que o lance que está vencendo o leilão,
		//cria um objeto Lance e atribui ao atributo que mantém o lance vencedor.
	}
	
	public void finalizarLance() {
		//fecha o leilão (não deixa registrar novos lances) e exibe o bem e do lance vencedor
		//(nome do arrematante e valor de arremate).
	}

}

/*
- Altere a classe Leilão para manter o registro de todos os lances efetuados, para, ao
finalizar o leilão, imprimir todos os lances registrados antes do vencedor.
 */