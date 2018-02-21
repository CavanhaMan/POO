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
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Funcionario func = new Funcionario();
		
		System.out.print("Digite o nome do funcion�rio: ");
		func.nome = sc.nextLine();
		System.out.print("Digite a quantidade de horas trabalhadas (hh:mm): ");
		func.horastrab = sc.nextLine();
		System.out.print("Digite o valor da hora: ");
		func.vlrhora = sc.nextDouble();
		
		func.calcularSalario();
		System.out.printf("O sal�rio do funcion�rio %s � R$%.2f.\n",func.nome,func.salario);
		
		sc.close();
	}
}