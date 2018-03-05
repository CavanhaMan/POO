package lista6_05_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private List<Filme> emprestados;
	
	Cliente(String nome, String cpf){
		super();
		this.nome=nome;
		this.cpf=cpf;
		emprestados = new ArrayList<Filme>();
	}
	
	public String getNome() { return this.nome; } 
	public void setNome(String nome) { this.nome = nome; }
	
	public String getCpf() { return this.cpf; }
	
	public void devolver(Filme f){
		emprestados.remove(f);
		f.setEmprestado(null);
	}
	
	public void emprestar(Filme f) {
		if (!f.getEmprestado()) {
			emprestados.add(f);
			f.setEmprestado(this);
		}
	}
	
	public List<Filme> getEmprestado() {
		//Collections.sort(emprestados);
		// como a lista não pode ser modificada, retorne usando
		// Collections.unmodifiableList.
		// que retorna ao usuário uma lista que não pode ser modificada
		// veja discussão em
		// https://stackoverflow.com/questions/33060592/getters-and-setters-for-arraylists-in-java
		return Collections.unmodifiableList(emprestados);
	}
	
}
