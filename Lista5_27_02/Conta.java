package Lista5_27_02;

public class Conta {

    private String titular;
    private static int id;
    private static int numero;
    private static String agencia;
    private double saldo;
    private double limite; // adicionando um limite a conta
    private static String dataabertura;

	public String getTitular() { return this.titular; }
	public void setTitular(String titular) { this.titular = titular; }
    public double getSaldo() { return this.saldo + this.limite; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    
   /* 2. Crie apenas os getters e setters necessários da sua classe Conta.
    * Pense sempre se é preciso criar cada um deles.
    */ 
    // construtor
    Conta (String titular) { this.titular = titular; }

    Conta (int id, String titular) {
        this(titular); // chama o construtor que foi declarado acima
        Conta.id = id;
    }

    /* Adicione um atributo na classe  Conta de tipo int que se chama identificador.
     * Esse identificador deve ter um valor único para  cada instância  do  tipo Conta. 
     * Crie um getter para o identificador. Devemos ter um setter?
     * R: Não, porque o identificador é calculado nos contrutores.
     */
 	public static int getId() { return Conta.id; }

    public void OpSaca (double valor) {}
    public void OpDeposita (double valor) {}
    public void OpRendimento() {}
    
}