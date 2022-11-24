
public class EditorDeVideo extends Funcionario {
	
	public double getBonificacao(){
		System.out.println("Aplicando método de bonificação de editor de vídeo");
		return getSalario() + 100;
	}
}
