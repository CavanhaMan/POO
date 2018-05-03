package strategy.Ex1;

import java.util.Arrays;
import java.util.Random;

public class mSistematico extends Amostrador {
	public mSistematico(int[] codigosZip) {
		super(codigosZip);
		// TODO Auto-generated constructor stub
	}

	int[] subConjunto = new int[tamanhoAmostra];
	Random generator = new Random();

	// faz c�pia da população.
	// n�o queremos causar efeitos colaterais.
	int[] populacaoOrdenada = new int[populacao.length];
	System.arraycopy(populacao, 0, populacaoOrdenada, 0, populacao.length);
	Arrays.sort(populacaoOrdenada);
	
	int step = populacaoOrdenada.length / tamanhoAmostra;
	int startingPoint = generator.nextInt(step);
	
	// seleciona elementos em intervalo regular ‘step’
	for (int i = 0; i < tamanhoAmostra; i++)
		subConjunto[i] = populacaoOrdenada[startingPoint + (i * step)];

	return subConjunto;
}
