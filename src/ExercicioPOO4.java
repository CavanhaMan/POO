/*
+--------------------+
| Rodrigo CavanhaMan |
|  Exerc�cios POO 4  |
+--------------------+
*/
import java.util.Scanner;

public class ExercicioPOO4 {

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
		System.out.printf("A m�dia aritim�tica dos n�mero �: %.2f.\n",(N1+N2+N3+N4)/4);

		sc.close();
	}
}

