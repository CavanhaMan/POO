package Lista5;

public class Conta {

    private String titular;
    private int numero;
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
    
    // construtor
    Conta (String titular) {
        //faz mais uma série de inicializações e configurações
        this.titular = titular;
    }

    Conta (int numero, String titular) {
        this(titular); // chama o construtor que foi declarado acima
        this.numero = numero;
    }



    // deposita() saca() e transfere() omitidos

    
    
}


