/*
+--------------------+
| Rodrigo CavanhaMan |
|  Exercícios POO 3  |
+--------------------+
*/
import java.util.Scanner;

public class ExercicioPOO3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double altura, base;
		
		System.out.println("Forneça a altura do retângulo:");
		altura = sc.nextDouble();
		System.out.println("Forneça a base do retângulo:");
		base = sc.nextDouble();
		
		System.out.printf("A área do retângulo é: %.2f.\n",base*altura);
		System.out.printf("O perímetro do retângulo é: %.2f.\n",2*(base+altura));

		sc.close();
	}
}

