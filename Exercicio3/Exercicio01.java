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

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Circulo circulo = new Circulo();
		
		System.out.printf("Digite o raio do círculo: ");
		circulo.raio = sc.nextDouble();
		
		System.out.printf("O raio do círculo é %.2f.\n",circulo.raio);
		System.out.printf("O diâmetro do círculo é %.2f.\n",circulo.raio*2);
		
		sc.close();
	}
}

