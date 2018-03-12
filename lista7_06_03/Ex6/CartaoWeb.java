package lista7_06_03.Ex6;

public abstract class CartaoWeb {
	private String destinatario;

	public CartaoWeb() { super(); }
	public CartaoWeb(String destinatario) {
		super();
		this.destinatario = destinatario;
	}

	public String getDestinatario() { return destinatario; }
	public void setDestinatario(String destinatario) { this.destinatario = destinatario; }
	
	public abstract void showMessage();
	
}
