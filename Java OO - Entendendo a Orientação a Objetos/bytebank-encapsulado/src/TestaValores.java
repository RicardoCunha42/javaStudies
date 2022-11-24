
public class TestaValores {

	public static void main(String[] args) {
		Conta contaRicardo = new Conta (42, 8484);
		
		System.out.println(contaRicardo.getAgencia());
		System.out.println(contaRicardo.getNumero());
		System.out.println(contaRicardo.getTotal());
		System.out.println(Conta.getTotal());
		
		Conta contaClara = new Conta (21, 4242);
		System.out.println(contaClara.getAgencia());
		System.out.println(contaClara.getNumero());
		System.out.println(Conta.getTotal());
		
	}

}
