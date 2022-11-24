
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 16;
		int quantidadeDePessoas = 3;
		boolean acompanhado;
		
		if (quantidadeDePessoas >= 3) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {
		System.out.println("Parabéns, você tem mais de 18.");
		System.out.println("Seja bem vindo!");
		
		} else {
				System.out.println("Você tem menos de 18 e não está acompanhado.");
				System.out.println("Não pode entrar!");
			}
}

}
