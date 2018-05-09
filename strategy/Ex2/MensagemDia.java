package strategy.Ex2;

public class MensagemDia {
	private DiaDaSemana diadasemana;

	public MensagemDia(DiaDaSemana diadasemana) {
		super();
		this.diadasemana = diadasemana;
	}
	
	public static void maind(String[] args) {
		MensagemDia print2 = new MensagemDia(new diaSegunda());
		MensagemDia print3 = new MensagemDia(new diaTerca());
		MensagemDia print4 = new MensagemDia(new diaQuarta());
		MensagemDia print5 = new MensagemDia(new diaQuinta());
		MensagemDia print6 = new MensagemDia(new diaSexta());
		MensagemDia print7 = new MensagemDia(new diaSabado());
		MensagemDia print1 = new MensagemDia(new diaDomingo());

		print2.imprime();
		print3.imprime();
		print4.imprime();
		print5.imprime();
		print6.imprime();
		print7.imprime();
		print1.imprime();
	}

	private void imprime() {
		diadasemana.imprimeMensagem();
		
	}
}
