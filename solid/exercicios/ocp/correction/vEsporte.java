/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
package solid.exercicios.ocp.correction;

public class vEsporte extends Veiculo {

	public vEsporte(int potencia, int alturaSuspencao) {
		super(potencia,alturaSuspencao);
	}
	

	@Override
	public void mudarModoDirecao() {
	    this.setPotencia(500);
	    this.setAlturaSuspencao(10);
	}
	
}
