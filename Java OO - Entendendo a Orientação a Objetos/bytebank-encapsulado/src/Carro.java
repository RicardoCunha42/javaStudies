
public class Carro {
	private int ano;
	private String modelo;
	private double preço;
	
	public Carro (int ano, String modelo, double preço) {
		if (ano > 0) {
			this.ano = ano;
		} else {
			System.out.println("Apenas números superiores a zero!");
		}
		if (modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("Por favor, insira modelo válido!");
		}
		if (preço > 0) {
			this.preço = preço;
		} else {
			System.out.println("Apenas números superiores a zero!");
		}
	}
	
	public Carro (String modelo, double preço) {
		this(2017, modelo, preço);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
}


