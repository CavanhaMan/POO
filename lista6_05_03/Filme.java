package lista6_05_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filme {
	private String nome;
	private Cliente emprestado;
	
	public Filme(String nome) {
		super();
		this.nome=nome;
	}
	
	public boolean getEmprestado() {
		return emprestado != null ? true : false;
	}
	
	public void setEmprestado(Cliente emprestado) {
		this.emprestado = emprestado;
	}
	
	public String getNome() { return nome; }
	public void setNome() { this.nome = nome; }
	
}
