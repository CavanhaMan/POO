package designpattern.adapter;

public class Teste {

	public static void main(String[] args) {
		Cliente c = new Cliente(new SomadorAdapter());
		c.executar();

	}

}
