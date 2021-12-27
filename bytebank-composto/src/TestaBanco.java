
public class TestaBanco {
    public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.nome = "Eugênio";
		cliente.cpf = "111.111.111-11";
		cliente.profissao = "programador";
		
		Conta contaCliente1 = new Conta();
		
		contaCliente1.deposita(100);
		
		contaCliente1.titular = cliente;
		System.out.println("Nome do titular: " + contaCliente1.titular.nome);
	}
}
