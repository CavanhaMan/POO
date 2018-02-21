package Lista3;
/*
+--------------------+
| Rodrigo CavanhaMan |
|   Terceira Lista   |
|   de Exercícios    |
|        POO         |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;
public class Exercicio310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		Funcionario func3 = new Funcionario();

		System.out.print("Digite o nome do 1º funcionário: ");
		func1.nome = sc.nextLine();
		System.out.print("Digite a quantidade de horas trabalhadas (hh:mm): ");
		func1.horastrab = sc.nextLine();
		System.out.print("Digite o valor da hora: ");
		func1.vlrhora = Double.parseDouble(sc.nextLine());
		System.out.println();
		
		System.out.print("Digite o nome do 1º funcionário: ");
		func2.nome = sc.nextLine();
		System.out.print("Digite a quantidade de horas trabalhadas (hh:mm): ");
		func2.horastrab = sc.nextLine();
		System.out.print("Digite o valor da hora: ");
		func2.vlrhora = Double.parseDouble(sc.nextLine());
		System.out.println();
			
		System.out.print("Digite o nome do 1º funcionário: ");
		func3.nome = sc.nextLine();
		System.out.print("Digite a quantidade de horas trabalhadas (hh:mm): ");
		func3.horastrab = sc.nextLine();
		System.out.print("Digite o valor da hora: ");
		func3.vlrhora = Double.parseDouble(sc.nextLine());
		System.out.println();
			
		func1.calcularSalario();
		System.out.printf("O salário do funcionário %s é R$%.2f.\n",func1.nome,func1.salario);
		func2.calcularSalario();
		System.out.printf("O salário do funcionário %s é R$%.2f.\n",func2.nome,func2.salario);
		func3.calcularSalario();
		System.out.printf("O salário do funcionário %s é R$%.2f.\n",func3.nome,func3.salario);

		sc.close();
	}
}