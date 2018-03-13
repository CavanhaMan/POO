package lista7_06_03.Ex7;

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo() { super(); }
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() { return base; }
	public void setBase(double base) { this.base = base; }
	
	public double getAltura() { return altura; }
	public void setAltura(double altura) { this.altura = altura; }

	double calcularPerimetro() {
		return (2*base) + (2*altura);
	}
	double calcularArea() {
		return (base*altura);
	}

}
