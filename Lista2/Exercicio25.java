package Lista2;
/*
+--------------------+
| Rodrigo CavanhaMan |
|   Segunda Lista    |
|   de Exercícios    |
|        POO         |
+--------------------+
*/
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a primeira palavra: ");
		String word1 = sc.nextLine();
		System.out.printf("Digite a segunda palavra: ");
		String word2 = sc.nextLine();
		if (word1.equals(word2))
			System.out.println("Igual");
		else
			System.out.println("Diferente");
		
		sc.close();
	}
}
