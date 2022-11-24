
public class TestaCarro {
	
	public static void main(String[] args) {
		Carro carro = new Carro(1995, "Corsa", 42000);
		System.out.println(carro.getAno());
		System.out.println(carro.getModelo());
		System.out.println(carro.getPreço());
		
		Carro carro2 = new Carro ("Fox", 84000); 
		System.out.println(carro2.getAno());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getPreço());
	}
}
