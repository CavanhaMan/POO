/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
package solid.exercicios.ocp.corretion2;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	public static void main(String[] args) {
		
		ManipuladorDeEventos manipulador = new ManipuladorDeEventos(null);
		
		Veiculo FordKa = new ModoDirecao(ECONOMICO);
		Veiculo Fuscao = new ModoDirecao(AVENTURA);
		Veiculo Ferrari = new ModoDirecao(ESPORTE);
		Veiculo Mustang = new ModoDirecao(ESPORTE);
		Veiculo Fox = new ModoDirecao(PASSEIO);
		Veiculo Gol = new ModoDirecao(PASSEIO);
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(FordKa);
		veiculos.add(Fuscao);
		veiculos.add(Ferrari);
		veiculos.add(Mustang);
		veiculos.add(Fox);
		veiculos.add(Gol);
		
		for (Veiculo veiculo : veiculos)
			System.out.printf("Potência: %d Altura: %d\n", veiculo.getPotencia(), veiculo.getAlturaSuspencao());

	}
}
