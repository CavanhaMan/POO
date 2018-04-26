/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
package solid.exercicios.ocp.correction;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	public static void main(String[] args) {
		
		ManipuladorDeEventos manipulador = new ManipuladorDeEventos(null);
		
		Veiculo FordKa = new vPasseio(400, 20);
		Veiculo Fuscao = new vAventura(500, 30);
		Veiculo Ferrari = new vEsporte(500, 10);
		Veiculo Mustang = new vEsporte(50, 10);
		Veiculo Troller = new vAventura(500, 30);
		Veiculo Jeep = new vAventura(500, 30);
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(FordKa);
		veiculos.add(Fuscao);
		veiculos.add(Ferrari);
		veiculos.add(Mustang);
		veiculos.add(Troller);
		veiculos.add(Jeep);
		
		for (Veiculo veiculo : veiculos)
			System.out.printf("Potência: %d\nAltura: %d\n", veiculo.getPotencia(), veiculo.getAlturaSuspencao());

	}
}
