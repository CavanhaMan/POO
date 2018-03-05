package Lista5_27_02;

public class Conta {

    private String titular;
    private static int id;
    private static int numero;
    private static String agencia;
    private double saldo;
    private double limite; // adicionando um limite a conta
    private double salario;
    private static String dataabertura;

	public String getTitular() { return this.titular; }
	public void setTitular(String titular) { this.titular = titular; }

	public double getSaldo() { return this.saldo + this.limite; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    
    public int getNumero() { return this.numero; }
    public void setNumero(int numero) {}
    
    public String getAgencia() {return this.agencia; }
    public void setAgencia(String agencia) {}
    
    public Double getLimite() {return this.limite; }
    public void setLimite(Double salario) {}
    
    public Double getSalario() {return this.salario; }
    public void setSalario(Double salario) {}
    
    
    // construtor
    Conta (String titular) { this.titular = titular; }

    Conta (int id, String titular) {
        this(titular); // chama o construtor que foi declarado acima
        Conta.id = id;
    }

 	public static int getId() { return Conta.id; }
 	// não precisa do método setter porque o id será gerado nos contrutores.
   
 	public void OpSaca (double valor) {}
    public void OpDeposita (double valor) {}
    public void OpRendimento() {}
    
}