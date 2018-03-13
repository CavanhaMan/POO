package lista7_06_03.Ex7;

public class Circulo  implements FormaGeometrica {
	private double raio;
	
	public Circulo() { super(); }
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	public double getRaio() { return raio; }
	public void setRaio(double raio) { this.raio = raio; }
	
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

}
