package lista6_05_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Locadora {

	public static void main(String[] args) {
		Filme f1 = new Filme("BATMAN");
		Filme f2 = new Filme("X-MEN");
		Filme f3 = new Filme("HULK");
		Filme f4 = new Filme("IRONMAN");
		Cliente c1 = new Cliente("João", "");
		Cliente c2 = new Cliente("Maria", "");
		c1.emprestar(f1);
		c1.emprestar(f3);
		
		
		imprimeFilmesEmprestados(c1);
		
		c1.devolver(f1);
		c1.devolver(f3);
		imprimeFilmesEmprestados(c1);
	}

	private static void imprimeFilmesEmprestados(Cliente c1) {
		System.out.println("Filmes emprestados para: "+c1.getNome());
		for(Filme filme : c1.getEmprestado()) {
			System.out.println(filme.getNome());
		}
	}

}
