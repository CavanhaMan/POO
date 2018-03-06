package lista6_05_03;

public class TesteLeilao {

	public static void main(String[] args) {
		// Implemente uma classe de teste e crie algumas instâncias de Leilão e realize as
		// operações de registrar lance e finalizar para teste.
		Leilao l1 = new Leilao("biscreta",10.0);
		l1.registrarLance("a", 5.0);
		l1.registrarLance("b", 10.0);
		l1.registrarLance("c", 20.0);
		l1.registrarLance("d", 15.0);
		l1.registrarLance("e", 100.0);
		l1.finalizarLance();

	}

}
