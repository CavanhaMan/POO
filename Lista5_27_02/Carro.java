package Lista5_27_02;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor;
	
	// liga o carro
	void liga() {
		System.out.println("O carro est� ligado");
	}

	// acelera uma certa quantidade
	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}

	// devolve a marcha do carro
	int pegaMarcha() {
		if (this.velocidadeAtual < 0) 
			return -1;
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40)
			return 1;
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80)
			return 2;
		return 3;
	}
}

class Motor {
	int potencia;
	String tipo;
}