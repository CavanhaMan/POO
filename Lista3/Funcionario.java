public class Funcionario {
	String nome;
	String horastrab;
	Double vlrhora;
	Double salario;
	

	public double calcularSalario() {
		String[] horas = horastrab.split(":");
		int h = Integer.parseInt(horas[0]);
		int m = Integer.parseInt(horas[1]);
		int tempo = h*60+m;
		salario = tempo * vlrhora / 60;
		return salario;
	}
}
