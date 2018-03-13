package lista7_06_03.Ex7;

public class Main {

	public static void main(String[] args) {
		// main que cria um
		// ret�ngulo com base 3 e altura 4 e um c�rculo com raio 5 e armazene estes objetos em uma lista.
		// Em seguida, imprima os per�metros e as �reas de todas as formas usando um la�o for.
		Retangulo ret = new Retangulo(3,4);
		Circulo circ = new Circulo(5);
		
        FormaGeometrica formas[] = {ret, circ};

        for (int i = 0; i < formas.length; i++) {
            System.out.printf("Perimetro: %.2f\n", formas[i].calcularPerimetro());
            System.out.printf("Area: %.2f\n", formas[i].calcularArea());
            System.out.println();
        }

	}

}
