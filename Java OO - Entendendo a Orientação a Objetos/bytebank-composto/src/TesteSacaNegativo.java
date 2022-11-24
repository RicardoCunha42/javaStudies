
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta contaRicardo = new Conta();
		contaRicardo.deposita(420);
		contaRicardo.saca(421);
		
		System.out.println(contaRicardo.pegaSaldo());
	}
}