package Lista5_27_02;

public class Conta {

    private String titular;
    private static int id;
    private double saldo;
    private double limite; // adicionando um limite a conta

	public String getTitular() {
	   return this.titular;
	}
	
	public void setTitular(String titular) {
	   this.titular = titular;
	}

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   /* 2. Crie apenas os getters e setters necess�rios da sua classe Conta.
    * Pense sempre se � preciso criar cada um deles.
    */ 
    // construtor
    Conta (String titular) {
        //faz mais uma s�rie de inicializa��es e configura��es
        this.titular = titular;
    }

    Conta (int id, String titular) {
        this(titular); // chama o construtor que foi declarado acima
        Conta.id = id;
    }



    /* Adicione um atributo na classe  Conta de tipo int que se chama identificador.
     * Esse identificador deve ter um valor �nico para  cada inst�ncia  do  tipo Conta. 
     * Crie um getter para o identificador. Devemos ter um setter?
     * R: N�o � necess�rio criar um setter, pois o identificador � calculado nos contrutores.
     */
 	public static int getId() {
 		return Conta.id;
 	}

    
    
}