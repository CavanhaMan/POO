package Lista3;
/*
+--------------------+
| Rodrigo CavanhaMan |
|   Terceira Lista   |
|   de Exerc�cios    |
|        POO         |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Funcionario pessoa = new Funcionario();
		
		System.out.print("Digite o nome do funcion�rio: ");
		pessoa.nome = sc.nextLine();
		System.out.print("Digite a quantidade de horas trabalhadas (hh:mm): ");
		pessoa.horastrab = sc.nextLine();
		System.out.print("Digite o valor da hora: ");
		pessoa.vlrhora = sc.nextDouble();
		
		pessoa.calcularSalario();
		System.out.printf("O funcion�rio %s receber� um sal�rio de R$%.2f.\n",pessoa.nome,pessoa.salario);
		
		/*
		String[] horas = new String[2];
		horas = pessoa.horastrab.split(":");
		int h = Integer.parseInt(horas[0]);
		int m = Integer.parseInt(horas[1]);
		int tempo = h*60+m;
		Double salario = tempo * pessoa.vlrhora / 60;
		
		System.out.printf("O funcion�rio %s trabalhou %s horas e %s minutos a R$%.2f a hora, totalizando um sal�rio de R$%.2f.\n",pessoa.nome,h,m,pessoa.vlrhora,salario);
		*/
		sc.close();
	}
}