/*
+--------------------+
| Rodrigo CavanhaMan |
|  Exerc�cios POO 3  |
+--------------------+
*/
import java.util.Scanner;

public class ExercicioPOO3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double altura, base;
		
		System.out.println("Forne�a a altura do ret�ngulo:");
		altura = sc.nextDouble();
		System.out.println("Forne�a a base do ret�ngulo:");
		base = sc.nextDouble();
		
		System.out.printf("A �rea do ret�ngulo �: %.2f.\n",base*altura);
		System.out.printf("O per�metro do ret�ngulo �: %.2f.\n",2*(base+altura));

		sc.close();
	}
}

