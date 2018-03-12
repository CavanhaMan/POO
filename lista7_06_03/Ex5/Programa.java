package lista7_06_03.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(new Assistente("b","10",100.0));
		funcionarios.add(new Vendedor("c","10",100.0, 20.0));
		funcionarios.add(new Gerente("a","10",100.0));
		
		for (Funcionario funcionario : funcionarios) {
			//System.out.println("Pagar para o funcionário " + funcionario.getNome() + " -> " + funcionario.calculaSalario());
			System.out.println("Pagar para o funcionário " + funcionario.getNome() + " -> " + funcionario.calculaSalario());
		}
		
	}

}
