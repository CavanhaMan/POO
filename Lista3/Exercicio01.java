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

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Circulo circulo = new Circulo();
		
		System.out.printf("Digite o raio do c�rculo: ");
		circulo.raio = sc.nextDouble();
		
		System.out.printf("O raio do c�rculo � %.2f.\n",circulo.raio);
		System.out.printf("O di�metro do c�rculo � %.2f.\n",circulo.raio*2);
		
		sc.close();
	}
}

