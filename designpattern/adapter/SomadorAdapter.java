package designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado {
	
	@Override
	public int somaVetor(int[] vetor) {
		//cria um objeto do somador existente
		SomadorExistente somador = new SomadorExistente();
		//converter o array de inteiros em uma lista de inteiros
		List<Integer> lista = new ArrayList<Integer>();
		for (int i=0 ; i<vetor.length ; i++)
			lista.add(vetor[i]);
		return somador.somaLista(lista);
	}
}
