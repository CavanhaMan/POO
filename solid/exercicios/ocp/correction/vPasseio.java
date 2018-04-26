/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
package solid.exercicios.ocp.correction;

public class vPasseio extends Veiculo {

	public vPasseio(int potencia, int alturaSuspencao) {
		super(potencia,alturaSuspencao);
	}
	
	
    @Override
	public void mudarModoDirecao() {
    	this.setPotencia(400);
        this.setAlturaSuspencao(20);
    }
}
