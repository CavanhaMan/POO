package lista7_06_03.Ex2_2;

public class Programa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa ("Joao","Medeiros");
		Funcionario pessoa2 = new Funcionario ("Leonardo", "Messias", 100, 1000.00);
		Professor pessoa3 = new Professor ("Ant�nio", "Silva", 200, 1500.00);
		
		System.out.println("Pessoa 1: " + pessoa1.getNomeCompleto());
		System.out.println("Pessoa 2 (Funcion�rio): " + pessoa2.getNomeCompleto());
		System.out.println("Pessoa 3 (Professor): " + pessoa3.getNomeCompleto());
		System.out.println("");
		System.out.printf("Primeira parcela do sal�rio da Pessoa 2 (funcion�rio): R$%.2f\n",pessoa2.getSalarioPrimeiraParcela());
		System.out.printf("Segunda parcela do sal�rio da Pessoa 2 (funcion�rio): R$%.2f\n",pessoa2.getSalarioSegundaParcela());
		System.out.printf("Primeira parcela do sal�rio da Pessoa 3 (professor): R$%.2f\n",pessoa3.getSalarioPrimeiraParcela());
		System.out.printf("Segunda parcela do sal�rio da Pessoa 3 (professor): R$%.2f\n",pessoa3.getSalarioSegundaParcela());

	}

}
