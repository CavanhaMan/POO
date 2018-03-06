package lista6_05_03;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private String nomebem;
	private Double vrminimo;
	private Boolean status;
	private Double lanceatual;
	private Double vencedorlance;
	private String vencedornome;
	List listaLances;
	
	public Leilao (String nomebem, Double vrminimo) {
		super();
		this.nomebem=nomebem;
		this.vrminimo=vrminimo;
		this.status=status;
	}
	
	public String getNomeBem() { return this.nomebem; } 
	public void setNomeBem(String nomebem) { this.nomebem = nomebem; }

	public Double getVrMinimo() { return this.vrminimo; } 
	public void setVrMinimo(Double vrminimo) { this.vrminimo = vrminimo; }
	
	public void registrarLance(String arrematante, Double vrlance) {
		if (status)
			if(vrlance <= vrminimo && vrlance <= lanceatual)
				if(vencedorlance!=null)
				 {
					vencedorlance = lanceatual;
					vencedornome = arrematante;
				}
		//se o leil�o estiver aberto e se valor for maior que o lance que est� vencendo o leil�o,
		//cria um objeto Lance e atribui ao atributo que mant�m o lance vencedor.
	}
	
	public void finalizarLance() {
		//fecha o leil�o (n�o deixa registrar novos lances) e exibe o bem e do lance vencedor
		//(nome do arrematante e valor de arremate).
	}

}

/*
- Altere a classe Leil�o para manter o registro de todos os lances efetuados, para, ao
finalizar o leil�o, imprimir todos os lances registrados antes do vencedor.
 */