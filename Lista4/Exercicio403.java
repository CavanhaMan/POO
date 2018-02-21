package Lista4;
/*
+--------------------+
| Rodrigo CavanhaMan |
|    Quarta Lista    |
|   de Exercícios    |
|        POO         |
+--------------------+
*/
public class Exercicio403 {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();
		c1.entraRaio();
		System.out.printf("O raio do círculo é %.2f.\n",c1.raio);
		System.out.printf("O diâmetro do círculo é %.2f.\n",c1.raio*2);
		c2.entraRaio();
		System.out.printf("O raio do círculo é %.2f.\n",c2.raio);
		System.out.printf("O diâmetro do círculo é %.2f.\n",c2.raio*2);
		c3.entraRaio();
		System.out.printf("O raio do círculo é %.2f.\n",c3.raio);
		System.out.printf("O diâmetro do círculo é %.2f.\n",c3.raio*2);
	}
}

