package Lista2;
/*
+--------------------+
| Rodrigo CavanhaMan |
|   Segunda Lista    |
|   de Exerc�cios    |
|        POO         |
+--------------------+
*/
import java.util.Scanner;

public class Exercicio22e3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circulo circulo = new Circulo();
		
		System.out.printf("Digite o raio do c�rculo: ");
		circulo.raio = sc.nextDouble();
		
		double area = circulo.calculaArea();
		double circunf = circulo.calculaCircunferencia();
		
		System.out.printf("�rea do c�rculo: %.2f.\n",area);
		System.out.printf("Circunfer�ncia do c�rculo: %.2f.\n",circunf);
		
		sc.close();
	}
	
}

class Circulo {
	double raio;

	public double calculaArea() {
		return 2*3.14*raio*raio;
	}
	
	public double calculaCircunferencia() {
		return 3.14*raio*2;
	}
}
