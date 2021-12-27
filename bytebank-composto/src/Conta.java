public class Conta{

    private double saldo;
    int agencia, numero;
    Cliente titular;

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
}