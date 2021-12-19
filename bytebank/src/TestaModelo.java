
public class TestaModelo {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		
		conta1.saldo = 123.12;
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.deposita(23.21);
		System.out.println("Saldo: " + conta1.saldo);
		
		System.out.println(conta1.saque(50));
		System.out.println(conta1.saque(1000));
	}
}
