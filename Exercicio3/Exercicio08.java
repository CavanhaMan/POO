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

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();

		System.out.printf("Digite o raio do 1º círculo: ");
		c1.raio = sc.nextDouble();
		System.out.printf("Digite o raio do 2º círculo: ");
		c2.raio = sc.nextDouble();
		System.out.printf("Digite o raio do 3º círculo: ");
		c3.raio = sc.nextDouble();

		System.out.printf("Área do 1º círculo: %.2f.\n",c1.calculaArea());
		System.out.printf("Perímetro do 1º círculo: %.2f.\n\n",c1.calculaPerimetro());
		
		System.out.printf("Área do 2º círculo: %.2f.\n",c2.calculaArea());
		System.out.printf("Perímetro do 2º círculo: %.2f.\n\n",c2.calculaPerimetro());
		
		System.out.printf("Área do 3º círculo: %.2f.\n",c3.calculaArea());
		System.out.printf("Perímetro do 3º círculo: %.2f.\n\n",c3.calculaPerimetro());
		
		
		sc.close();
	}
}