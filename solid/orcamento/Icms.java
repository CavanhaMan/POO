package solid.orcamento;

public class Icms implements Imposto{

	@Override
	public void calculaImposto(Orcamento orcamento) {

		double icms = orcamento.getValor() * 0.10;
		System.out.println("Valor do ICMS: " + icms);
	}
	
}
