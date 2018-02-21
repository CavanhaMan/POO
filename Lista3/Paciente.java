package Lista3;
/*
+------------------------------------+
----------Rodrigo CavanhaMan----------
Classe usada nos seguintes programas:
+------------------------------------+
Exercicio03
Exercicio06
+------------------------------------+
*/
public class Paciente {
	String nome;
	static Double peso;
	static Double altura;
	static Double imc;
	
	public static double calcularIMC(){
		imc = peso/(altura*altura);
		return imc;
	}
}
