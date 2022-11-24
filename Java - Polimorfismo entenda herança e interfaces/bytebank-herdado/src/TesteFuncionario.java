
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario fRicardo = new Gerente("Ricardo", "4284", 3000);
		
		System.out.println(fRicardo.getNome());
		System.out.println(fRicardo.getBonificacao());

	}

}
