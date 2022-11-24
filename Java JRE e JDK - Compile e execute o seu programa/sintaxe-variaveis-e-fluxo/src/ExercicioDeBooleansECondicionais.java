
public class ExercicioDeBooleansECondicionais {
	public static void main(String[] args) {
		
		double renda = 2420;
		
		if (renda >= 1900.0 && renda <= 2800.0) {
			System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de R$ 142.");
		} else if (renda >= 2800.01 && renda <= 3751.0) {
				System.out.println("O IR é de 15% e pode deduzir R$ 350.");
			}
			 else if (renda >=  3751.01 && renda <= 4664.00) {
					System.out.println("O IR é de 22.5% e pode deduzir R$ 636.");
					}
		}
	}	

