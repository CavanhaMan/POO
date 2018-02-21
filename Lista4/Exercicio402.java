package Lista4;
/*
+--------------------+
| Rodrigo CavanhaMan |
|    Quarta Lista    |
|   de Exercícios    |
|        POO         |
+--------------------+
*/
public class Exercicio402 {

	public static void main(String[] args) {
		Funcionario pessoa = new Funcionario();
		pessoa.entraFuncionario();
		pessoa.calcularSalario();
		System.out.printf("O funcionário %s receberá um salário de R$%.2f.\n",pessoa.nome,pessoa.salario);
	}
}

