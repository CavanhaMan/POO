package Lista2;
/*
+--------------------+
| Rodrigo CavanhaMan |
|   Segunda Lista    |
|   de Exercícios    |
|        POO         |
+--------------------+
*/
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Casa casa = new Casa();
		
		System.out.printf("Digite o nome do proprietário: ");
		casa.proprietario.nome = sc.nextLine();
		System.out.printf("Digite o nome da rua: ");
		casa.endereco.logradouro = sc.nextLine();
		System.out.printf("Digite o número: ");
		casa.endereco.numero = sc.nextLine();
		System.out.printf("Digite  a cidade: ");
		casa.endereco.cidade = sc.nextLine();
		System.out.printf("Digite o estado: ");
		casa.endereco.estado = sc.nextLine();
		System.out.printf("Digite o CEP: ");
		casa.endereco.cep = sc.nextLine();
		
		System.out.printf("\n");
		System.out.format("╔══════════╦═════════════════════════╗\n");
		System.out.printf("║%10s║%25s║\n","Nome      ",casa.proprietario.nome);
		System.out.format("╠══════════╬═════════════════════════╣%n");
		System.out.printf("║%10s║%25s║\n","Logradouro",casa.endereco.logradouro);
		System.out.printf("║%10s║%25s║\n","Número    ",casa.endereco.numero);
		System.out.printf("║%10s║%25s║\n","Cidade    ",casa.endereco.cidade);
		System.out.printf("║%10s║%25s║\n","Estado    ",casa.endereco.estado);
		System.out.printf("║%10s║%25s║\n","CEP       ",casa.endereco.cep);
		System.out.format("╚══════════╩═════════════════════════╝%n");
		
		sc.close();
	}
}

class Pessoa {
	String nome;
}

class Endereco {
	String logradouro;
	String numero;
	String cidade;
	String estado;
	String cep;
}

class Casa {
	Pessoa proprietario = new Pessoa();
	Endereco endereco = new Endereco();
}
