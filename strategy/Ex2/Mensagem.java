package strategy.Ex2;

public class Mensagem {
	private String diasemana;
	
	void imprimeM(String diasemana){
		switch (diasemana){
		case "segunda":
			System.out.println("�.. o jeito � matar logo essa segunda...");
			break;
		case "terca":
			System.out.println("Segunda j� passou - bora trabalhar...");
			break;
		case "quarta":
			System.out.println("Bora l� que estamos no meio da semana!");
			break;
		case "quinta":
			System.out.println("Quinta - s� falta mais um dia!!");
			break;
		case "sexta":
			System.out.println("Sexta-feira eu s� trabalho pela metade!");
			break;
		case "sabado":
			System.out.println("Sabad�o chegou!! \\o/");
			break;
		case "domingo":
			System.out.println("Hoje � domingo!! :-D");
			System.out.println("Mas amanh� j� � segunda..  :�-(");
			break;
		}
	}

	public static void Main(String[] args){
		Mensagem print = new Mensagem();
		print.imprimeM("terca");

	}
}
