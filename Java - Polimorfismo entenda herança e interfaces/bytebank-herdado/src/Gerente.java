
public class Gerente extends Funcionario implements Autenticavel {
	//private String login;
	private AutenticacaoUtil autenticador;
	
	public Gerente () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public Gerente (String nome, String cpf, double salario) {
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
		System.out.println("Aplicando método de bonificação de gerente");
		return this.getSalario();
	}
}
	
//	//sobrecarga
//	public boolean autentica(String senha, String login) {
//		if(this.senha() == senha && this.login == login) {
//			System.out.println("Autenticação validada!");
//			return true;
//		}else {
//			System.out.println("Senha ou login inválidos!");
//			return false;
//		}
//	}
	
//	public void setLogin(String login) {
//		this.login = login;
//	}	
//}
