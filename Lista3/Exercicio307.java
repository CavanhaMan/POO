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

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();

		System.out.printf("O raio do 1� c�rculo � 3\n");
		System.out.printf("O raio do 2� c�rculo � 4\n");
		System.out.printf("O raio do 3� c�rculo � 7\n\n");

		c1.raio = 3;
		c2.raio = 4;
		c3.raio = 7;
		
		System.out.printf("�rea do 1� c�rculo: %.2f.\n",c1.calculaArea());
		System.out.printf("Per�metro do 1� c�rculo: %.2f.\n\n",c1.calculaPerimetro());
		
		System.out.printf("�rea do 2� c�rculo: %.2f.\n",c2.calculaArea());
		System.out.printf("Per�metro do 2� c�rculo: %.2f.\n\n",c2.calculaPerimetro());
		
		System.out.printf("�rea do 3� c�rculo: %.2f.\n",c3.calculaArea());
		System.out.printf("Per�metro do 3� c�rculo: %.2f.\n\n",c3.calculaPerimetro());
		
		
		sc.close();
	}
	
}