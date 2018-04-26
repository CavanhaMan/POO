/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
package solid.exercicios.ocp.corretion2;

public class mPasseio extends ModoDirecao {

	public mPasseio(String modoDirecao) {
		super(modoDirecao);
	}

	@Override
	public void qualModoDirecao() {
	    this.setPotencia(500);
	    this.setAlturaSuspencao(10);
	}

}
