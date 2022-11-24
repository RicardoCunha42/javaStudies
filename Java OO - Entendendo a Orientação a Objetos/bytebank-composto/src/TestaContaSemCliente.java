public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaRicardo = new Conta();
		
		contaRicardo.titular = new Cliente (); 
		contaRicardo.titular.nome = "Ricardo";
		
		System.out.println(contaRicardo.titular.nome);
	}
}