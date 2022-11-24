
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente("Ricardo", "4284", 5000);
		
		Gerente g1 = new Gerente ("Sarah", "8484", 6000);
		
		EditorDeVideo ev1 = new EditorDeVideo();
		ev1.setSalario(7000);
		
		Designer d1 = new Designer();
		d1.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(f1);
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());

	}

}
