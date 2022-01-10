public class Conta{

    private double saldo;
    private int agencia, numero;
    private Cliente titular;
    private static int total;
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	
    	System.out.println("Criando uma conta...");
    	
    	setAgencia(agencia);
    	setNumero(numero);
    	
    	System.out.println("Conta criada!");
    }

    public void deposita(double valor) {
    	saldo += valor;
    }
    
    public boolean saque(double valor) {
    	if (this.saldo >= valor) {
    		this.saldo -= valor;
    
    		return true;
    	}
    	
    	return false;
    }
    
    public boolean transfere(Conta contaDestino, double valor) {
    	if (this.saque(valor)) {
    		contaDestino.deposita(valor);
    		
    		return true;
    	}
    	
    	return false;
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	if (numero > 0)
    		this.numero = numero;
    	else {
    		System.out.println("Erro - o número é negativo!");
    	}
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if (agencia > 0)
    		this.agencia = agencia;
    	else {
    		System.out.println("Erro - o número é negativo!");
    		return;
    	}
	}
     
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
    	return this.titular;
    }
    
    public static int getTotal() {
    	return Conta.total;
    }
}