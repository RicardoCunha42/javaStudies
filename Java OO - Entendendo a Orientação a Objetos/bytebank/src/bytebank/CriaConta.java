package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.00;
		System.out.println(segundaConta.saldo);
		
		System.out.println("O saldo da primeira conta � " + primeiraConta.saldo);
		System.out.println("O saldo da segunda conta � " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("� a mesma conta!");
		} else { 
			System.out.println("S�o contas diferentes!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
