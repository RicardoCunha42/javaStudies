
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gRicardo = new Gerente("Ricardo", "4284", 3000);

		Boolean autenticou = gRicardo.autentica("124");
		System.out.println(autenticou);
		
		Boolean autenticou2 = gRicardo.autentica("123");
		System.out.println(autenticou2);
		
		System.out.println(gRicardo.getBonificacao());
		
		System.out.println(gRicardo.autentica("124"));
		
		System.out.println(autenticou2);
	}

}
