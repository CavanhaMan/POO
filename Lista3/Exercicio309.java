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
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		Funcionario func3 = new Funcionario();

		System.out.print("Funcionário João trabalhou 20hs a R$3.50 a hora.\n");
		System.out.print("Funcionário Mateus trabalhou 40hs a R$5.5 a hora.\n");
		System.out.print("Funcionário Lucas trabalhou 40hs a R$13.5 a hora.\n");
		
		func1.nome = "João";
		func1.horastrab = "20:00";
		func1.vlrhora = 3.50;
		func2.nome = "Mateus";
		func2.horastrab = "40:00";
		func2.vlrhora = 5.50;
		func3.nome = "Lucas";
		func3.horastrab = "40:00";
		func3.vlrhora = 13.50;

		func1.calcularSalario();
		func2.calcularSalario();
		func3.calcularSalario();

		System.out.println();

		System.out.printf("O salário do funcionário %s é R$%.2f.\n",func1.nome,func1.salario);
		System.out.printf("O salário do funcionário %s é R$%.2f.\n",func2.nome,func2.salario);
		System.out.printf("O salário do funcionário %s é R$%.2f.\n",func3.nome,func3.salario);

		sc.close();
	}
}