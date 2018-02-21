package Lista4;
/*
+--------------------+
| Rodrigo CavanhaMan |
|    Quarta Lista    |
|   de Exercícios    |
|        POO         |
+--------------------+
*/
public class Exercicio401 {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.entraRaio();
		System.out.printf("O raio do círculo é %.2f.\n",circulo.raio);
		System.out.printf("O diâmetro do círculo é %.2f.\n",circulo.raio*2);
	}
}

