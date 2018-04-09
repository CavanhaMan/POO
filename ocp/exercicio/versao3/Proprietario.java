/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
package ocp.exercicio.versao3;

public class Proprietario extends Funcionario {
	public Proprietario (String nome, double salarioBase) {
		super(nome, "Proprietario", salarioBase);
	}
	
	public double calcula() {return 2*getSalarioBase();}
}