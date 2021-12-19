
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200.10;
		
		System.out.println("Saldo 1º conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 121.13;
		
		System.out.println("Novo saldo 1º conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("1º conta tem: " + primeiraConta.saldo);
		System.out.println("2º conta tem: " + segundaConta.saldo);	
		System.out.println(primeiraConta);
	}
}