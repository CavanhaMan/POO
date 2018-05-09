package strategy.Ex2;

public class Mensagem {
	private String diasemana;
	
	void imprimeM(String diasemana){
		switch (diasemana){
		case "segunda":
			System.out.println("É.. o jeito é matar logo essa segunda...");
			break;
		case "terca":
			System.out.println("Segunda já passou - bora trabalhar...");
			break;
		case "quarta":
			System.out.println("Bora lá que estamos no meio da semana!");
			break;
		case "quinta":
			System.out.println("Quinta - só falta mais um dia!!");
			break;
		case "sexta":
			System.out.println("Sexta-feira eu só trabalho pela metade!");
			break;
		case "sabado":
			System.out.println("Sabadão chegou!! \\o/");
			break;
		case "domingo":
			System.out.println("Hoje é domingo!! :-D");
			System.out.println("Mas amanhã já é segunda..  :´-(");
			break;
		}
	}

	public static void Main(String[] args){
		Mensagem print = new Mensagem();
		print.imprimeM("terca");

	}
}
