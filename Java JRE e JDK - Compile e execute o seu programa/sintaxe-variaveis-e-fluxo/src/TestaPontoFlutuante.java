
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario=1275.70;
		System.out.println("Meu salário é "+ salario + ".");		
		
		int teste=5/2;				// o int nunca dará quebrado e truncará o número,
		System.out.println(teste);	//	que fica 2 
		
		double teste2=5/2;			//Será lido da direita pra esquerda, a divisão dará
		System.out.println(teste2);	// 2 e o resultado será em double 2.0 pq os numeros estão int
		
		double teste3=5.0/2;		//O 5.0 em double possibilita o resultado quebrado 
		System.out.println(teste3); // de 2.5
		
		int teste4=4;				// double com int dá sempre double, de forma que o
		double teste5=5.5;			// resultado será 22.0
		System.out.println(teste4 * teste5);
		
		
	}
	
}
