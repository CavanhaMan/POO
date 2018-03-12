package lista7_06_03.Ex6;

public class Aniversario extends CartaoWeb {

	public Aniversario() { super(); }

	public Aniversario(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz aniversário " + super.getDestinatario());
	}

}
