
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.deposita(100);
		System.out.println(c1.saque(101));
		System.out.println(c1.getSaldo());
		//c1.saldo -= 101;
		System.out.println(c1.getSaldo());
	}
}
