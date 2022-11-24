
public class AutenticacaoUtil {
	private String senha;
	
	public void setSenha(String senha) {
		this.senha = senha;
	}	
	
	public boolean autentica(String senha) {
		if(this.senha == senha) {
			//System.out.println("Acesso validado!");
			return true;
		} else {
			//System.out.println("Acesso inválido!");
			return false;
		}
	}
}
