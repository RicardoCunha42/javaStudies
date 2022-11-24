
public class TesteSistema {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		
		Gerente g = new Gerente("Ricardo", "7474", 3000);	
		
		g.setSenha("S56D");
		g.autentica("S56D");
		
		sistema.autentica(g);
		
		Administrador a = new Administrador("Nandolares", "5555", 4000);
		a.setSenha("abcdy");
		a.autentica("abcdy");
		
		sistema.autentica(a);
		
		Autenticavel cliente = new Cliente();
		cliente.setSenha("S56D");
		cliente.autentica("S56D");
		
		sistema.autentica(cliente);
		
	}

}
