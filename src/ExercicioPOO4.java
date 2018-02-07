/*
+--------------------+
| Rodrigo CavanhaMan |
|  Exercícios POO 4  |
+--------------------+
*/
import java.util.Scanner;

public class ExercicioPOO4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Forneça o primeiro número: ");
		Double N1 = sc.nextDouble();
		System.out.printf("Forneça o segundo número: ");
		Double N2 = sc.nextDouble();
		System.out.printf("Forneça o terceiro número: ");
		Double N3 = sc.nextDouble();
		System.out.printf("Forneça o quarto número: ");
		Double N4 = sc.nextDouble();
		System.out.printf("A média aritimética dos número é: %.2f.\n",(N1+N2+N3+N4)/4);

		sc.close();
	}
}

