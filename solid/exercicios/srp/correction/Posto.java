package solid.exercicios.srp.correction;

public class Posto {
	public void reabastecer(Veiculo veiculo) {
		veiculo.setQuantidadeCombustivel(veiculo.getCapacidadeTanqueCombustivel());
	}
}
