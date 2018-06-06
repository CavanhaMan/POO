package designpattern.singleton;

public class IncrementalSingleTon {
	private static int count=0;
	private int numero;
	private static IncrementalSingleTon instancia;
	
	private IncrementalSingleTon() {
		numero = ++count;
	}
	
	public static IncrementalSingleTon getInstancia() {
		if (instancia == null)
			instancia = new IncrementalSingleTon();
		return instancia;
	}
	
	@Override
	public String toString() {
		return "Incremental " + numero;
	}
}
