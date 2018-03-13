package lista7_06_03.Ex7;

public class Circulo {
	private double raio;
	double pi = 3.14;
	
	public Circulo() { super(); }
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	public double getRaio() { return raio; }
	public void setRaio(double raio) { this.raio = raio; }
	
	double calcularPerimetro() {
		return 2 * pi * raio;
	}
	double calcularArea() {
		return pi * raio * raio;
	}

}
