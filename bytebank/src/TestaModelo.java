
public class TestaModelo {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		
		conta1.saldo = 123.12;
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.deposita(23.20);
		System.out.println("Saldo: " + conta1.saldo);
		
		Conta conta2 = new Conta();
		
		System.out.println(conta1.transfere(conta2, 50));
		
		System.out.println("Saldo 1º conta: " + conta1.saldo);
		System.out.println("Saldo 2º conta: " + conta2.saldo);
		
		System.out.println(conta1.transfere(conta2, 100));
		System.out.println("Saldo 1º conta: " + conta1.saldo);
		System.out.println("Saldo 2º conta: " + conta2.saldo);
	}
}
