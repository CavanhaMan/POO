/*
+--------------------+
| Rodrigo CavanhaMan |
|  Exercícios POO 5  |
+--------------------+
*/
import java.util.Scanner;

public class ExercicioPOO5 {

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
		Double media = (N1+N2+N3+N4)/4;
		System.out.printf("A média aritimética dos número é: %.2f.\n",media);
		if (media>=6)
			System.out.println("Aprovado!");
		else
			System.out.println("Reprovado!");

		sc.close();
	}
}

