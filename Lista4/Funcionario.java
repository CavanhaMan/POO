package Lista4;
/*
+------------------------------------+
----------Rodrigo CavanhaMan----------
Classe usada nos seguintes programas:
+------------------------------------+
Exercicio
+------------------------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
	String nome;
	String horastrab;
	Double vlrhora;
	Double salario;
	

	public double calcularSalario() {
		String[] horas = horastrab.split(":");
		int h = Integer.parseInt(horas[0]);
		int m = Integer.parseInt(horas[1]);
		int tempo = h*60+m;
		salario = tempo * vlrhora / 60;
		return salario;
	}
	
	public void entraFuncionario() {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.print("Digite o nome do funcionário: ");
		nome = sc.nextLine();
		System.out.print("Digite a quantidade de horas trabalhadas (hh:mm): ");
		horastrab = sc.nextLine();
		System.out.print("Digite o valor da hora: ");
		vlrhora = sc.nextDouble();
		
		sc.close();
	}
}
