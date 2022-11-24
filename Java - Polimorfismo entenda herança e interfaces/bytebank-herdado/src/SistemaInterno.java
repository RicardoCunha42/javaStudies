
public class SistemaInterno {
	private String senha = "S56D";
	
	public void autentica (Autenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("Você entrou no sistema!");

		} else {
			System.out.println("Você não entrou no sistema!");
	
		}
	}
	
}
