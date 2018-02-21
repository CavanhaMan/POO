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

public class Exercicio306 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Paciente paciente = new Paciente();
		
		System.out.print("Digite o nome do paciente: ");
		paciente.nome = sc.nextLine();
		System.out.print("Digite o peso do paciente (kg): ");
		Paciente.peso = sc.nextDouble();
		System.out.print("Digite a altura do paciente (m): ");
		Paciente.altura = sc.nextDouble();
		
		Paciente.calcularIMC();
		diagnostico(Paciente.imc);
		//diagnostico(paciente.imc);
		
		sc.close();
	}

	private static void diagnostico(Double indice) {
		if (indice < 16)
			System.out.printf("IMC = %.2f, indicando magreza grave.",indice);
		if (indice >= 16 && indice < 17)
			System.out.printf("IMC = %.2f, indicando magreza moderada.",indice);
		if (indice >= 17 && indice < 18.5)
			System.out.printf("IMC = %.2f, indicando magreza leve.",indice);
		if (indice >= 18.5 && indice < 25)
			System.out.printf("IMC = %.2f, indicando saudável.",indice);
		if (indice >= 25 && indice < 30)
			System.out.printf("IMC = %.2f, indicando sobrepeso.",indice);
		if (indice >= 30 && indice < 35)
			System.out.printf("IMC = %.2f, indicando obesidade grau I.",indice);
		if (indice >= 35 && indice < 40)
			System.out.printf("IMC = %.2f, indicando obesidade grau II (Severa).",indice);
		if (indice >= 40)
			System.out.printf("IMC = %.2f, indicando obesidade grau III (Mórbida).",indice);
		
	}
		
}