/*
+--------------------+
| Rodrigo CavanhaMan |
|  Exerc�cios POO 5  |
+--------------------+
*/
import java.util.Scanner;

public class ExercicioPOO5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Forne�a o primeiro n�mero: ");
		Double N1 = sc.nextDouble();
		System.out.printf("Forne�a o segundo n�mero: ");
		Double N2 = sc.nextDouble();
		System.out.printf("Forne�a o terceiro n�mero: ");
		Double N3 = sc.nextDouble();
		System.out.printf("Forne�a o quarto n�mero: ");
		Double N4 = sc.nextDouble();
		Double media = (N1+N2+N3+N4)/4;
		System.out.printf("A m�dia aritim�tica dos n�mero �: %.2f.\n",media);
		if (media>=6)
			System.out.println("Aprovado!");
		else
			System.out.println("Reprovado!");

		sc.close();
	}
}

