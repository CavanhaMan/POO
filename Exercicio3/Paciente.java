public class Paciente {
	String nome;
	Double peso;
	Double altura;
	Double imc;
	
	//Double imc = peso/(altura*altura);

	public double calcularIMC(){
		imc = peso/(altura*altura);
		return imc;
	}
}
