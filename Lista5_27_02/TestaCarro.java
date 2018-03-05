package Lista5_27_02;

public class TestaCarro {
	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "Cinza";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 120;
		// liga o carro
		meuCarro.liga();
		// acelera o carro
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
	}
}