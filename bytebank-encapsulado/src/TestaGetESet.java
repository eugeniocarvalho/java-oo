
public class TestaGetESet {
    public static void main(String[] args) {
		Conta c1 = new Conta(1223, 123);
				
		System.out.println(c1.getNumero());
		
		Cliente eugenio = new Cliente();
		
		eugenio.setNome("Eugênio C.");
		
		c1.setTitular(eugenio);
		
		System.out.println("Nome titular: " + c1.getTitular().getNome());
		 
		c1.getTitular().setProfissao("programmer");
	}
}
