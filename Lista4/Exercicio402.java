package Lista4;
/*
+--------------------+
| Rodrigo CavanhaMan |
|    Quarta Lista    |
|   de Exerc�cios    |
|        POO         |
+--------------------+
*/
public class Exercicio402 {

	public static void main(String[] args) {
		Funcionario pessoa = new Funcionario();
		pessoa.entraFuncionario();
		pessoa.calcularSalario();
		System.out.printf("O funcion�rio %s receber� um sal�rio de R$%.2f.\n",pessoa.nome,pessoa.salario);
	}
}

