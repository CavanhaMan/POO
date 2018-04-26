/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|   Exercício  OCP   |
+--------------------+
*/
package solid.exercicios.ocp.corretion2;

public abstract class ModoDirecao {
    private String modoDirecao;
    
	public ModoDirecao(String modoDirecao) {
		this.modoDirecao=modoDirecao;
	}

	public String getModoDirecao() {return modoDirecao;}
	public void setModoDirecao(String modoDirecao) {this.modoDirecao = modoDirecao;}
    
	public abstract void qualModoDirecao();
	
}
