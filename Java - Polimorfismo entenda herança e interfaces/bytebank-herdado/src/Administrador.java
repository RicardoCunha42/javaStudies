
public class Administrador extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;
	
	public Administrador () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public Administrador (String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
		}	

	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		System.out.println("Aplicando método de bonificação de administrador");
		return 20;
	}
	
}
