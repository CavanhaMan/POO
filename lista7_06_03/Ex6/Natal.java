package lista7_06_03.Ex6;

public class Natal extends CartaoWeb {

	public Natal() { super(); }

	public Natal(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz natal " + super.getDestinatario());
	}

}
