package lista7_06_03.Ex6;

public class DiaDosNamorados extends CartaoWeb {

	public DiaDosNamorados() { super(); }

	public DiaDosNamorados(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
        System.out.println("Feliz dia dos namorados " + super.getDestinatario());
    }

}
