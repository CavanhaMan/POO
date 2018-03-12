package lista7_06_03.Ex4;

public class EquipamentoSonoro extends Equipamento {
	private int volume;
	private boolean stereo;

	public EquipamentoSonoro() { super(); }
	public EquipamentoSonoro(boolean ligado) { super(ligado); }
	public int getVolume() { return volume; }
	public void setVolume(int volume) { this.volume = volume; }
	public boolean isStereo() { return stereo; }
	public void setStereo(boolean stereo) { this.stereo = stereo; }
	public EquipamentoSonoro(int volume, boolean stereo) {
		super();
		this.volume = volume;
		this.stereo = stereo;
	}
	
	void mono() {
		//Torna o atributo stereo falso
	}
	void stereo() {
		//Torna o atributo stereo verdadeiro
	}
	void liga() {
		//Efeito Sobrescreve o m�todo liga da superclasse.
		//Este m�todo deve chamar o m�todo liga da superclasse e ajustar o atributo volume para 5
	}
	
}
