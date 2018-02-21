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

public class Exercicio303 {

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
		
		//Double imc = paciente.peso/(paciente.altura*paciente.altura);
		Paciente.calcularIMC();
		diagnostico();
		//diagnostico(paciente.imc);
		
		sc.close();
	}

	private static void diagnostico() {
		if (Paciente.imc < 16)
			System.out.printf("IMC = %.2f, indicando magreza grave.",Paciente.imc);
		if (Paciente.imc >= 16 && Paciente.imc < 17)
			System.out.printf("IMC = %.2f, indicando magreza moderada.",Paciente.imc);
		if (Paciente.imc >= 17 && Paciente.imc < 18.5)
			System.out.printf("IMC = %.2f, indicando magreza leve.",Paciente.imc);
		if (Paciente.imc >= 18.5 && Paciente.imc < 25)
			System.out.printf("IMC = %.2f, indicando saudável.",Paciente.imc);
		if (Paciente.imc >= 25 && Paciente.imc < 30)
			System.out.printf("IMC = %.2f, indicando sobrepeso.",Paciente.imc);
		if (Paciente.imc >= 30 && Paciente.imc < 35)
			System.out.printf("IMC = %.2f, indicando obesidade grau I.",Paciente.imc);
		if (Paciente.imc >= 35 && Paciente.imc < 40)
			System.out.printf("IMC = %.2f, indicando obesidade grau II (Severa).",Paciente.imc);
		if (Paciente.imc >= 40)
			System.out.printf("IMC = %.2f, indicando obesidade grau III (Mórbida).",Paciente.imc);
		
	}
		
}