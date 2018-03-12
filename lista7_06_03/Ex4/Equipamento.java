package lista7_06_03.Ex4;

public class Equipamento {
	private boolean ligado;

	public Equipamento() { super(); }

	public Equipamento(boolean ligado) {
		super();
		this.ligado = ligado;
	}

	public boolean isLigado() { return ligado; }
	public void setLigado(boolean ligado) { this.ligado = ligado; }
	
	void liga() {
		this.ligado = true;
	}
	void desliga() {
		this.ligado = false;
	}
}
