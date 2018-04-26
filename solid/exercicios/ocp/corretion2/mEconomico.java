/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
package solid.exercicios.ocp.corretion2;

public class mEconomico extends ModoDirecao {

	public mEconomico(String modoDirecao) {
		super(modoDirecao);
	}

	@Override
	public void qualModoDirecao() {
	    this.setPotencia(500);
	    this.setAlturaSuspencao(10);
	}

}
