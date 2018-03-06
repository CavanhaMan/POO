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