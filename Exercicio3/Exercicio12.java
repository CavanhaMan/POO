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

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Circulo circulo = new Circulo();
		
		System.out.printf("Digite o raio do círculo: ");
		circulo.raio = sc.nextDouble();
		
		double area = circulo.calculaArea();
		double circunf = circulo.calculaPerimetro();
		
		System.out.printf("Área do círculo: %.2f.\n",area);
		System.out.printf("Perímetro do círculo: %.2f.\n",circunf);
		
		sc.close();
	}
	
}