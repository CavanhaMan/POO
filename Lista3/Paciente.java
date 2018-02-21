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
