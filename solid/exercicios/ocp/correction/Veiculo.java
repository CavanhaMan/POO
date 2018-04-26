/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
package solid.exercicios.ocp.correction;

public abstract class Veiculo {

	private int potencia;
	private int alturaSuspencao;
	
	public Veiculo(int potencia, int alturaSuspencao) {
		this.potencia=potencia;
		this.alturaSuspencao=alturaSuspencao;
	}
	
	public abstract void mudarModoDirecao();

	public int getPotencia() {return potencia;}
	public int getAlturaSuspencao() {return alturaSuspencao;}

	public void setPotencia(int potencia) {this.potencia = potencia;}
	public void setAlturaSuspencao(int alturaSuspencao) {this.alturaSuspencao = alturaSuspencao;}
}