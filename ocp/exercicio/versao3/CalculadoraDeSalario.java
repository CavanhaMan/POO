/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
// adicionar cargo supervisor -> salario=1.5*salario base
// adicionar regra se o vendedor bater a meta, ganha bonus de 50. A meta é definida para cada vendedor.
package ocp.exercicio.versao3;

public class CalculadoraDeSalario {
	double incentivo;

	public CalculadoraDeSalario(double incentivo) {
		super();
		this.incentivo = incentivo;
	}

	public double calcula(Funcionario f1) {
		return f1.calcula() + incentivo;
	}
}
