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

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Circulo circulo = new Circulo();
		
		System.out.printf("Digite o raio do c�rculo: ");
		circulo.raio = sc.nextDouble();
		
		double area = circulo.calculaArea();
		double circunf = circulo.calculaPerimetro();
		
		System.out.printf("�rea do c�rculo: %.2f.\n",area);
		System.out.printf("Per�metro do c�rculo: %.2f.\n",circunf);
		
		sc.close();
	}
	
}