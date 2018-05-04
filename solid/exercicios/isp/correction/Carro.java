package solid.exercicios.isp.correction;

public class Carro extends Veiculo implements Radio {

    private boolean radioOn;

    public boolean isRadioOn() {return radioOn;}

	@Override
	public void ligarRadio() {radioOn = true;}

	@Override
	public void desligarRadio() {radioOn = false;}

}