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

	public EquipamentoSonoro(boolean ligado, int volume, boolean stereo) {
		super(ligado);
		this.volume = volume;
		this.stereo = stereo;
	}
	
	void mono() {
		this.stereo = false;
	}
	void stereo() {
		this.stereo = true;
	}
	@Override
	void liga() {
		super.setLigado(true);
		this.volume = 5;
	}
	
}
