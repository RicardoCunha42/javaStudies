
public class TestaGetESet{
	public static void main(String[] args) {
		Conta contaRicardo = new Conta();
		
		contaRicardo.setAgencia(42);
		System.out.println(contaRicardo.getAgencia());
		
		contaRicardo.setNumero(4284);
		System.out.println(contaRicardo.getNumero());
		
		Cliente Ricardo = new Cliente();
		
		contaRicardo.setTitular(Ricardo);
		Cliente titular = contaRicardo.getTitular();
		
		System.out.println(contaRicardo.getTitular());
		System.out.println(Ricardo);
		System.out.println(titular);
		
		Ricardo.setNome("Ricardo Cunha");
		System.out.println(Ricardo.getNome());
		
		contaRicardo.getTitular().setNome("Ricardo Andrade");
		System.out.println(contaRicardo.getTitular().getNome());
	}
}