package Lista1;
/*
+--------------------+
| Rodrigo CavanhaMan |
|  Exercícios POO 7  |
+--------------------+
*/
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 299;
		while(x>=101) {
			if(x%2!=0)
				System.out.printf("%d\n",x);
			x--;
		}
		sc.close();
	}
}

