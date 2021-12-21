public class Conta{

    double saldo;
    int agencia, numero;
    String titular;

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
}