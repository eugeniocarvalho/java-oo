
public class TestaSemCliente {
    public static void main(String[] args) {
		Conta c1 = new Conta();
		
		System.out.println(c1.getSaldo());
		
		c1.titular = new Cliente();
		
		c1.titular.nome = "Cliente 1";
		
		System.out.println("Nome: " + c1.titular.nome);
	}
}
