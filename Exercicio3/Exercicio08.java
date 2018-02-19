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

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();

		System.out.printf("Digite o raio do 1� c�rculo: ");
		c1.raio = sc.nextDouble();
		System.out.printf("Digite o raio do 2� c�rculo: ");
		c2.raio = sc.nextDouble();
		System.out.printf("Digite o raio do 3� c�rculo: ");
		c3.raio = sc.nextDouble();

		System.out.printf("�rea do 1� c�rculo: %.2f.\n",c1.calculaArea());
		System.out.printf("Per�metro do 1� c�rculo: %.2f.\n\n",c1.calculaPerimetro());
		
		System.out.printf("�rea do 2� c�rculo: %.2f.\n",c2.calculaArea());
		System.out.printf("Per�metro do 2� c�rculo: %.2f.\n\n",c2.calculaPerimetro());
		
		System.out.printf("�rea do 3� c�rculo: %.2f.\n",c3.calculaArea());
		System.out.printf("Per�metro do 3� c�rculo: %.2f.\n\n",c3.calculaPerimetro());
		
		
		sc.close();
	}
}