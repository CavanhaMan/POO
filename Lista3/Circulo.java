package Lista3;
/*
+------------------------------------+
----------Rodrigo CavanhaMan----------
Classe usada nos seguintes programas:
+------------------------------------+
Exercicio01
Exercicio12
Exercicio08
Exercicio07
Exercicio04
+------------------------------------+
*/
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
}
