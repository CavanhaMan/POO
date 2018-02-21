package Lista4;/*
+------------------------------------+
----------Rodrigo CavanhaMan----------
Classe usada nos seguintes programas:
+------------------------------------+
Exercicio
+------------------------------------+
*/

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
	double raio;
	double area;
	double circunf;

	public double calculaArea() {
		area = 2*3.14*raio*raio;
		return area;
	}
	
	public double calculaPerimetro() {
		circunf = 3.14*raio*2;
		return circunf;
	}
	
	public void entraRaio() {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.printf("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		sc.close();
	}
}
