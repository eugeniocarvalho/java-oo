
public class TestaValores {
	public static void main(String[] args) {
		Conta c1 = new Conta(1230, 123);
		
		System.out.println(c1.getAgencia());
		System.out.println();
		Conta c2 = new Conta(1230, 125);
		
		System.out.println("\nNº de contas: " + Conta.getTotal());
//		c1.setAgencia(-1010);
//		c1.setNumero(-829);
	}
}
