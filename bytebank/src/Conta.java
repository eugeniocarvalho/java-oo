public class Conta{

    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
    	saldo += valor;
    }
    
    public boolean saque(double valor) {
    	if (saldo - valor >= 0) {
    		saldo -= valor;
    		return true;
    	}
    	
    	return false;    		
    }
}